x = int(input())

data = []

for _ in range(9):
	data.append(int(input()))

print(x - sum(data))