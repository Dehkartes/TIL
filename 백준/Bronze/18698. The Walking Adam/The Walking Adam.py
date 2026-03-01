for _ in range(int(input())):
	cnt = 0
	for i in input():
		if i == 'U':
			cnt += 1
		else:
			break

	print(cnt)