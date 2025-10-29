a, b = map(int, input().split())
x = a * b // 24200
if a * b % 24200 != 0:
	x += 1
print(x)