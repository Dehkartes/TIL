def f(x):
	s = str(x)
	return int(s[0]) * len(s)

x = int(input())
t = f(x)
if t == f(x):
	print("FA")
else:
	print("NFA")
