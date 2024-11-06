from transformers import AutoModelForCausalLM, AutoTokenizer, modeling_utils, TrainerCallback
from datasets import load_dataset
from trl import SFTConfig, SFTTrainer, DataCollatorForCompletionOnlyLM
from peft import get_peft_config, get_peft_model, LoraConfig, TaskType
import torch
import wandb


wandb.init(project='Hanghae99')
wandb.run.name = 'NonLora'

# dataset = load_dataset("facebook/opt-350m", split="train")
dataset = load_dataset("lucasmccabe-lmi/CodeAlpaca-20k", split="train")
model = AutoModelForCausalLM.from_pretrained("facebook/opt-350m")
tokenizer = AutoTokenizer.from_pretrained("facebook/opt-350m")

# 메모리 사용량 체크
class MemoryLoggingCallback(TrainerCallback):
	def on_log(self, args, state, control, logs=None, **kwargs):
		if torch.cuda.is_available():
			max_memory_allocated = torch.cuda.max_memory_allocated(0) / 1024**3  # Convert to GB
			print(f"\nMax Alloc: {round(max_memory_allocated, 1)} GB")
			logs['max_memory_allocated'] = round(max_memory_allocated, 1)
			if wandb.run:
				wandb.log({'max_memory_allocated': max_memory_allocated})

# 인스트럭션 튜닝
def formatting_prompts_func(example):
	output_texts = []
	for i in range(len(example['instruction'])):
		text = f"### Question: {example['instruction'][i]}\n ### Answer: {example['output'][i]}"
		output_texts.append(text)
	return output_texts

response_template = " ### Answer:"
collator = DataCollatorForCompletionOnlyLM(response_template, tokenizer=tokenizer)

train_args = SFTConfig(
	output_dir="./temp/clm-instruction-tuningNONLORA",
	num_train_epochs=3,
	logging_strategy="steps",
	logging_steps=10,
	max_seq_length=1024,
	per_device_train_batch_size=4
)
trainer = SFTTrainer(
	model,
	train_dataset=dataset,
	args=train_args,
	formatting_func=formatting_prompts_func,
	data_collator=collator,
	callbacks=[MemoryLoggingCallback]
)
trainer.train()