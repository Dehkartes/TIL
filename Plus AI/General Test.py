# %% [markdown]
# # HuggingFace로 두 문장의 논리적 모순 분류하기
# 
# 이번 실습에서는 HuggingFace로 영화리뷰 감정 분석과 같은 text 분류 문제를 위한 모델을 구현합니다.
# 먼저 필요한 library들을 설치하고 import합니다.

# %%
# !pip install transformers datasets evaluate accelerate scikit-learn

# %%
import random
import evaluate
import numpy as np

from datasets import load_dataset
from transformers import AutoTokenizer, AutoModelForSequenceClassification

import torch

device = torch.device("cuda" if torch.cuda.is_available() else "cpu")
print(device)

# %% [markdown]
# ## Dataset 준비
# 
# 그 다음 감정 분석을 위해 사용할 imdb dataset을 `load_dataset` 함수로 다운로드 받습니다.

# %%
imdb = load_dataset("nyu-mll/glue", "mnli")
imdb

# %% [markdown]
# `load_dataset`은 HuggingFace의 `datasets` library의 함수로, HuggingFace의 hub에서 dataset을 다운로드 받을 수 있도록 만든 함수입니다.
# 출력 결과를 보시면 `imdb`는 `train`, `test`, 그리고 `unsupervised` data로 구성되어있습니다.
# 이 중에서 우리는 `train`과 `test`를 활용합니다.
# 
# `train` data를 한 번 살펴보겠습니다.

# %%
imdb['train'][0]

# %% [markdown]
# `train`과 `test`의 각 data는 `text`와 `label`로 구성되어있습니다.
# 각각은 영화리뷰와 해당 영화리뷰의 긍정/부정 여부를 의미합니다.
# 이는 이전 주차들에서 사용한 imdb dataset과 동일합니다.
# 
# 이번에는 tokenizer를 불러와서 미리 text들을 tokenize합니다.

# %%
tokenizer = AutoTokenizer.from_pretrained("bert-base-uncased")\

def preprocess_function(data):
    return tokenizer(data["premise"], data["hypothesis"], truncation=True)

imdb_tokenized = imdb.map(preprocess_function, batched=True)

# %% [markdown]
# Tokenizer를 실행할 때 넘겨주었던 `truncation` 옵션은 주어진 text가 일정 길이 이상이면 잘라내라는 의미입니다.
# 만약 특정 길이 값이 같이 주어지지 않는다면 `bert-base-cased`를 학습할 때 사용한 text의 최대 길이를 기준으로 값을 결정합니다.

# %%
print(imdb_tokenized['train'][0].keys())
print(imdb_tokenized)

# %% [markdown]
# 마지막 출력 결과를 보면, `text`와 `label` 이외에 `input_ids`가 생기신 것을 확인하실 수 있습니다.
# 이는 우리가 `AutoTokenizer.from_pretrained`로 불러온 tokenizer로 text를 token들로 나누고 정수 index로 변환한 결과입니다.
# 
# 이번에는 `train` data를 쪼개 training data와 validation data를 만들어보겠습니다.

# %%
imdb_split = imdb_tokenized['train'].train_test_split(test_size=0.2)
imdb_train, imdb_val = imdb_split['train'], imdb_split['test']
imdb_test = imdb_tokenized['validation_matched']

# %% [markdown]
# HuggingFace `datasets`로 불러온 dataset은 `train_test_split`으로 쉽게 쪼갤 수 있습니다.
# 
# 다음은 각 split의 크기입니다.

# %%
len(imdb_train), len(imdb_val), len(imdb_test)

# %%
imdb_train.features

# %%
print(imdb_train[0])
print(tokenizer.convert_ids_to_tokens(imdb_train[0]['input_ids']))

# %% [markdown]
# ## Model 구현
# 
# 이번에는 text 분류를 수행할 Transformer를 구현합니다.
# 이전에는 Transformer의 구성 요소들을 직접 구현하여 합쳤습니다.
# 이번에는 HuggingFace의 BERT를 활용하여 인자만 넘겨주는 식으로 구현해보겠습니다:

# %%
from transformers import BertConfig

config = BertConfig()

config.hidden_size = 64  # BERT layer의 기본 hidden dimension
config.intermediate_size = 64  # FFN layer의 중간 hidden dimension
config.num_hidden_layers = 2  # BERT layer의 개수
config.num_attention_heads = 4  # Multi-head attention에서 사용하는 head 개수
config.num_labels = 3  # 마지막에 예측해야 하는 분류 문제의 class 개수

model = AutoModelForSequenceClassification.from_config(config)

# %% [markdown]
# BERT는 이전에 배운 Transformer의 architecture를 그대로 사용합니다.
# 그래서 BERT의 옵션들만 수정하면 vanilla Transformer를 쉽게 구현할 수 있습니다.
# 
# Transformer 구현 이외에 분류 문제에 맞춰 첫 번째 token을 linear classifier를 거치는 등의 과정은 `AutoModelForSequenceClassification`이 구현해줍니다.
# 즉, 우리가 `config`로 넘겨주는 BERT의 마지막에 linear classifier를 달아주는 역할을 합니다.

# %% [markdown]
# ## 학습 코드
# 
# 다음은 위에서 구현한 Transformer를 imdb로 학습하는 코드를 구현합니다.
# 먼저 다음과 같이 학습 인자들을 정의합니다.

# %%
from transformers import TrainingArguments, Trainer

training_args = TrainingArguments(
    output_dir='hf_transformer',  # 모델, log 등을 저장할 directory
    num_train_epochs=10,  # epoch 수
    per_device_train_batch_size=128,  # training data의 batch size
    per_device_eval_batch_size=128,  # validation data의 batch size
    logging_strategy="epoch",  # Epoch가 끝날 때마다 training loss 등을 log하라는 의미
    do_train=True,  # 학습을 진행하겠다는 의미
    do_eval=True,  # 학습 중간에 validation data에 대한 평가를 수행하겠다는 의미
    eval_strategy="epoch",  # 매 epoch가 끝날 때마다 validation data에 대한 평가를 수행한다는 의미
    save_strategy="epoch",  # 매 epoch가 끝날 때마다 모델을 저장하겠다는 의미
    learning_rate=1e-3,  # optimizer에 사용할 learning rate
    load_best_model_at_end=True  # 학습이 끝난 후, validation data에 대한 성능이 가장 좋은 모델을 채택하겠다는 의미
)

# %% [markdown]
# 각각의 부분들은 이전 주차에서 배웠던 내용들을 설정하는 것에 불과하다는 것을 알 수 있습니다.
# 요약하면 다음과 같습니다:
# - `epochs`: training data를 몇 번 반복할 것인지 결정합니다.
# - `batch_size`: training data를 얼마나 잘게 잘라서 학습할 것인지 결정합니다.
# - `learning_rate`: optimizer의 learning rate를 얼마로 할 것인지 결정합니다.
# 위의 부분들 이외에도 사소한 구현 요소들도 지정할 수 있습니다.
# 
# 다음은 loss 이외의 평가 함수들을 구현하는 방법입니다.

# %%
import evaluate

accuracy = evaluate.load("accuracy")


def compute_metrics(pred):
    predictions, labels = pred
    predictions = np.argmax(predictions, axis=1)
    return accuracy.compute(predictions=predictions, references=labels)

# %% [markdown]
# `evaluate` 또한 HuggingFace의 library로 다양한 평가 함수들을 제공하고 있습니다.
# 이번 실습의 경우, 감정 분석 문제는 분류 문제이기 때문에 정확도를 계산할 수 있습니다.
# 위와 같이 예측 결과(`pred`)와 실제 label(`labels`)가 주어졌을 때 정확도를 계산하는 것은 `evaluate`의 accuracy 함수로 구현할 수 있습니다.
# 
# 마지막으로 위의 요소들을 종합하여 학습할 수 있는 `Trainer`를 구현합니다.

# %%
from transformers import EarlyStoppingCallback


trainer = Trainer(
    model=model,
    args=training_args,
    train_dataset=imdb_train,
    eval_dataset=imdb_val,
    compute_metrics=compute_metrics,
    tokenizer=tokenizer,
    # callbacks = [EarlyStoppingCallback(early_stopping_patience=1)]
)

# %% [markdown]
# 모델, training 인자, training과 validation data, 부가적인 평가 함수, 그리고 tokenizer를 넘겨주면 끝입니다.
# 별개로 early stopping과 같은 기능도 주석 친 부분과 같이 `callbacks`로 구현할 수 있으니 참고해주시길 바랍니다.
# 
# 위와 같이 만든 `Trainer`는 다음과 같이 학습을 할 수 있습니다.

# %%
trainer.train()

# %% [markdown]
# 보시다시피 training loss는 잘 떨어지는 반면, validation loss는 중간부터 쭉 올라가는 것을 볼 수 있습니다.
# Overfitting이 일어났다고 볼 수 있습니다.
# 
# 위와 같이 학습이 끝난 후 validation loss가 가장 낮은 모델을 가지고 test data의 성능을 평가하는 것은 다음과 같이 구현할 수 있습니다.

# %%
trainer.evaluate(imdb_test)

# %% [markdown]
# 이전에 학습 인자에서 `load_best_model_at_end=True`를 넘겨줬기 때문에 `trainer`는 학습이 끝난 후, 기본적으로 validation loss가 가장 좋은 모델을 가지고 `evaluate`를 진행합니다.
# 실제로 결과를 보면 `eval_loss`가 가장 낮은 validation loss와 유사한 것을 볼 수 있습니다.
# 
# 평가할 때 사용한 모델은 다음과 같이 저장할 수 있습니다.

# %%
trainer.save_model()


