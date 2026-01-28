input()
x = input()

if x[-1] == 'G':
	x = x [0 : -1]
else:
	x += 'G'

print(x)