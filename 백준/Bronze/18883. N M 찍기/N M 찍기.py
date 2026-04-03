n, m = map(int, input().split())

num = 1

for i in range(n):
	arr = []
	for j in range(m):
		arr.append(num)
		num += 1
	print(*arr)