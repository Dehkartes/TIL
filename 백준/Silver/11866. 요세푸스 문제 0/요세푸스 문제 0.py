n, k = map(int, input().split())

arr = [i for i in range(1, n + 1)]
reuslt = [arr[k - 1]]
arr[k - 1] = -1

current = k - 1
for _ in range(n-1):
	i = 0
	while i < k:
		current = (current + 1) % n
		if arr[current] != -1:
			i += 1
	reuslt.append(arr[current])
	arr[current] = -1
	
print("<"+", ".join(map(str,reuslt))+">")