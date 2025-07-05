n, m, k = map(int, input().split())

if n > k:
	print(m * k + m)
else:
	print(m * k)