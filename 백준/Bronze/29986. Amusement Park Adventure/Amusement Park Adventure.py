n, h = map(int, input().split())

cnt = 0

for i in map(int, input().split()):
	if i <= h:
		cnt += 1

print(cnt)