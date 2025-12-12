for i in range(int(input())):
	print(f"String #{i + 1}")
	for c in input():
		if c == 'Z':
			print('A', end='')
		else:
			print(chr(ord(c) + 1), end='')
	print("\n")