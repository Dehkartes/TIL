import torch
import torchvision
import torchvision.transforms as transforms
import os
os.environ['CUDA_LAUNCH_BLOCKING'] = "1"
os.environ["CUDA_VISIBLE_DEVICES"] = "0"
os.environ["TORCH_USE_CUDA_DSA"] = '1'

transform = transforms.ToTensor()

trainset = torchvision.datasets.MNIST(
	root='./data',
	train=True,
	download=True,
	transform=transform
)

testSet = torchvision.datasets.MNIST(
	root='./data',
	train=False,
	download=True,
	transform=transform
)

from matplotlib import pyplot as plt

print(len(trainset))
print(trainset[0][0].shape, trainset[0][1])
plt.imshow(trainset[0][0][0], cmap='gray')

print(len(testSet))
print(testSet[0][0].shape, testSet[0][1]) # testSet[데이터 인덱스][0: 데이터, 1: 라벨]
plt.imshow(testSet[0][0][0], cmap='gray')

batch_size = 64

trainloader = torch.utils.data.DataLoader(
	trainset,
	batch_size=batch_size,
	shuffle=True
)

testLoader = torch.utils.data.DataLoader(
	testSet,
	batch_size=batch_size,
	shuffle=False
)

dataiter = iter(trainloader)
images, labels = next(dataiter)
print(images.shape, labels.shape)

from torch import nn


class Model(nn.Module): # nn.Modlue 상속
	def __init__(self, input_dim, n_dim):
		super().__init__()

		self.layer1 = nn.Linear(input_dim, n_dim)
		self.layer2 = nn.Linear(n_dim, n_dim)
		self.layer3 = nn.Linear(n_dim, 10)

		self.act = nn.ReLU()

	def forward(self, x):
		x = torch.flatten(x, start_dim=1)
		x = self.act(self.layer1(x))
		x = self.act(self.layer2(x))
		x = self.act(self.layer3(x))
		return x


model = Model(28 * 28 * 1, 1024)

from torch.optim import SGD

lr = 0.001
model = model.to('cuda')

optimizer = SGD(model.parameters(), lr=lr)

# 손실함수 정의 (criterion ?)

lossFunction = nn.CrossEntropyLoss()
n_epochs = 100
print(batch_size)
for epoch in range(n_epochs):
	total_loss = 0.
	for data in trainloader:
		model.zero_grad()
		inputs, labels = data
		inputs, labels = inputs.to('cuda'), labels.to('cuda')

		preds = model(inputs)
		loss = lossFunction(preds, labels)
		#loss = (preds[:, 0] - labels).pow(2).mean() #MSE
		loss.backward()
		optimizer.step()

		total_loss += loss.item()

	print(f"Epoch {epoch:3d} | Loss: {total_loss}")