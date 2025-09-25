res = 0
mn = 999

for i in [int(input()) for _ in range(7)]:
	if i % 2 != 0:
		res += i
		if i < mn:
			mn = i

if res > 0:
	print(res)
	print(mn)
else:
	print(-1)