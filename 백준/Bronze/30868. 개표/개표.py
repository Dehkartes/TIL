for _ in range(int(input())):
	x = int(input())
	print((x // 5) * "++++ ", end="")
	print((x % 5) * "|")
