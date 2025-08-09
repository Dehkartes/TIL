x = input()

if len(x) > 2 and x[1] == '0':
	print(int(x[0:2]) + int(x[2:]))
else:
	print(int(x[0]) + (int(x[1:])))