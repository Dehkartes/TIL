arr = [1 for _ in range(30)]

for _ in range(28):
	arr[int(input()) - 1] = 0

for i in range(30):
	if arr[i] == 1:
		print(i + 1)