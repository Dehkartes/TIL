for i in range(1, int(input()) + 1):
	x = i ** 2
	if x > 100:
		print('*' * 100 + '...')
	else:
		print('*' * x)