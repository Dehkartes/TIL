x = int(input())

for i in range(1, x + 1):
	print((x - i) * ' ' + '*' + ' ' * ((i - 1) * 2 - 1) + ('*' if i > 1 else ''))