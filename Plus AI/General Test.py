import torch
import os

print()
print(torch.version.cuda)
print()
device = torch.device('cuda' if torch.cuda.is_available() else 'cpu')
print('Device:', device)
print(torch.cuda.is_available())
print(torch.__version__)