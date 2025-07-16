def foo(x, start, end):
	return x[0 : start] + x[end : ]

for _ in range(int(input())):
	text, st, en = input().split()
	print(foo(text, int(st), int(en)))