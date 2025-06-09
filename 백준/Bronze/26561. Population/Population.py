for _ in range(int(input())):
	x, y = map(int, input().split())

	death = y // 7
	birth = y // 4

	print(x - death + birth)