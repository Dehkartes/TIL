n, k = map(int, input().split())

arr = []
arrev = []
for i in range(1, int(n ** 0.5) + 1):
	if n % i == 0:
		arr.append(i)
		if i ** 2 != n:
			arrev.insert(0, n // i)

arr.extend(arrev)

if len(arr) < k:
	print(0)
else:
	print(arr[k - 1])
