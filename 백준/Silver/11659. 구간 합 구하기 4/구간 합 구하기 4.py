import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))
prefix = [0]

for i in range(0, n):
	prefix.append(prefix[i] + arr[i])

for _ in range(m):
	x, y = map(int, input().split())
	sys.stdout.write(str(prefix[y] - prefix[x - 1]) + "\n")