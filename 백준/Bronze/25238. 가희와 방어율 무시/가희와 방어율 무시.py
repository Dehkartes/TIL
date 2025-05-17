a, b = map(int, input().split())
if(a - (a * b / 100.0) >= 100):
	print(0)
else:
	print(1)