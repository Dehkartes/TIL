a, b, n = map(int, input().split())

cnt = 0

for i in range(a, b + 1):
	for c in str(i):
		if c == str(n):
			cnt += 1

print(cnt)
