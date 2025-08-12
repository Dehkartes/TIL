arr = [-1 for _ in range(10)]

for _ in range(5):
	i = int(input())
	if arr[i] == -1:
		arr[i] = i
	else:
		arr[i] = -1

print(*[i for i in arr if i != -1])