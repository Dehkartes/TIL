while True:
	x = int(input())
	if x == 0:
		break
	print(sum([i for i in range(1, x + 1)]))
