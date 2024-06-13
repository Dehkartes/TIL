n, m = map(int, input().split())

arr = [i for i in range(1, n + 1)]

for i in range(m):
	x, y = map(int, input().split())
	arr[x - 1], arr[y - 1] = arr[y - 1], arr[x - 1]

print(*arr)