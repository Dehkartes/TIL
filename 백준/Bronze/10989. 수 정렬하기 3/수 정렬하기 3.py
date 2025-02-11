import sys

input = sys.stdin.readline

n = int(input())

x = [0 for _ in range(10000)]

for _ in range(n):
	x[int(input()) - 1] += 1

cnt = 1
for i in x:
	if i > 0:
		for _ in range(i):
			print(cnt)
	cnt += 1