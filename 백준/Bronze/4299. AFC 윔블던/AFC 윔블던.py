a, b = map(int, input().split())

x = (a + b) / 2
y = (max(a, b) - min(a, b)) / 2

if x % 1 != 0 or y % 1 !=0 or a < b:
	print(-1)
else:
	print(int(max(x, y)), int(min(x, y)))