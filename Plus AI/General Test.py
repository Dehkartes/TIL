# %% [markdown]
# # MNLI 문제 해결을 위한 모델 학습

# %% [markdown]
# ## 라이브러리 설치 및 임포트

# HuggingFace의 transformers 및 datasets 라이브러리 설치
# !pip install transformers datasets evaluate

import numpy as np
import evaluate
from datasets import load_dataset
from transformers import AutoTokenizer, AutoModelForSequenceClassification, TrainingArguments, Trainer
import pandas as pd

# %% [markdown]
# ## 데이터셋 로드 및 전처리

# MNLI 데이터셋 로드
dataset = load_dataset("nyu-mll/glue", "mnli")

# Train split만 사용하며, validation data는 train split에서 따로 분리
train_valid_split = dataset['train'].train_test_split(test_size=0.1)
train_dataset = train_valid_split['train']
valid_dataset = train_valid_split['test']

# Pre-trained tokenizer 로드
tokenizer = AutoTokenizer.from_pretrained("bert-base-uncased")

# 입력 데이터를 tokenizer로 변환하는 함수 정의
def preprocess_function(examples):
    return tokenizer(examples['premise'], examples['hypothesis'], truncation=True)

# 데이터셋에 tokenizer 적용
train_dataset = train_dataset.map(preprocess_function, batched=True)
valid_dataset = valid_dataset.map(preprocess_function, batched=True)
test_dataset = dataset['validation_matched'].map(preprocess_function, batched=True)

# %% [markdown]
# ## 모델 준비 및 학습 설정

# BERT 모델 로드 (Sequence Classification)
model = AutoModelForSequenceClassification.from_pretrained("bert-base-uncased", num_labels=3)

# 학습 설정
training_args = TrainingArguments(
    output_dir='./results',
    evaluation_strategy="epoch",
    learning_rate=2e-5,
    per_device_train_batch_size=16,
    per_device_eval_batch_size=16,
    num_train_epochs=3,
    weight_decay=0.01,
    logging_dir='./logs',
    logging_steps=50,
    save_strategy="epoch",
    load_best_model_at_end=True,
)

# 정확도 측정 함수 정의
accuracy = evaluate.load("accuracy")

def compute_metrics(eval_pred):
    logits, labels = eval_pred
    predictions = np.argmax(logits, axis=-1)
    return accuracy.compute(predictions=predictions, references=labels)

# Trainer 객체 생성
trainer = Trainer(
    model=model,
    args=training_args,
    train_dataset=train_dataset,
    eval_dataset=valid_dataset,
    compute_metrics=compute_metrics,
    tokenizer=tokenizer,
)

# %% [markdown]
# ## 모델 학습

# 모델 학습 수행
trainer.train()

# %% [markdown]
# ## 모델 평가

# validation_matched 데이터셋에 대한 성능 평가
eval_results = trainer.evaluate(test_dataset)

# 결과를 DataFrame으로 변환해 보기 좋게 출력
eval_results_df = pd.DataFrame([eval_results])
print(eval_results_df)

# 정확도 50% 이상 확인
if eval_results['eval_accuracy'] > 0.5:
    print(f"Validation accuracy is {eval_results['eval_accuracy']:.2f}, which is above 50%")
else:
    print(f"Validation accuracy is {eval_results['eval_accuracy']:.2f}, which is below 50%")
