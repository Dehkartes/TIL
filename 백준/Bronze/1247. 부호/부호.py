for _ in range(3):
	x = sum(int(input()) for _ in range(int(input())))
	if x < 0:
		print('-')
	elif x > 0:
		print('+')
	else:
		print('0')