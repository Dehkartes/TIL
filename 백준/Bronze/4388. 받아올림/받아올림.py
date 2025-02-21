while True:
	x, y = input().split()

	if x == '0' and y == '0':
		exit()

	axis = 0

	x = list(reversed(x))
	y = list(reversed(y))

	temp = sorted([x, y], key=lambda x: len(x))
	
	short = temp[0]
	long = temp[1]

	result = 0
	remainder = 0
	for i in range(0, len(long)):
		if i > len(short) - 1:
			sm = int(long[i]) + remainder
		else:
			sm = int(short[i]) + int(long[i]) + remainder
		if sm > 9:
			result += 1
			remainder = 1
		else:
			remainder = 0

	print(result)