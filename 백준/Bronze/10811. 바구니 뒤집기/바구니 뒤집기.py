n, m = map(int, input().split())

arr = [i for i in range(1, n + 1)]

for _ in range(m):
	i, j = map(int, input().split())
	arrf = arr[ : i - 1]
	arrm = list(reversed(arr[i - 1 : j]))
	arrb = arr[j : ]
	arr = []
	if len(arrf) > 0:
		arr += arrf
	if len(arrm) > 0:
		arr += arrm
	if len(arrb) > 0:
		arr += arrb
			
print(*arr)