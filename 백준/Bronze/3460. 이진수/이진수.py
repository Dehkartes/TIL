for _ in range(int(input())):
	for i, v in enumerate(reversed(str(bin(int(input()))))):
		if v == '1':
			print(i, end=' ')
