from heapq import *

n, m = map(int, input().split())

vec = list(map(int, input().split()))

res = 0

for i in range(n):
	for j in range(i + 1, n):
		for k in range(j + 1, n):
			x = vec[i] + vec[j] + vec[k]
			if x <= m and x > res:
				res = x

print(res)