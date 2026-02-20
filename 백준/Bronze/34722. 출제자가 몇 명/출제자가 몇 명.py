cnt = 0
for _ in range(int(input())):
	s, c, a, r = map(int, input().split())

	if 1000 <= s or 1600 <= c or 1500 <= a or (r >= 1 and r <= 30):
		cnt += 1

print(cnt)
