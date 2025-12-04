x = int(input())

for i in range(1, x):
	print((x - i) * ' ' + '*' + (2 * i - 3) * ' ' + ('*' if i > 1 else '') )

print('*' * (2 * x - 1))