for i in range(1, int(input()) + 1):
	x = sorted(list(map(int, input().split())))
	print(f"Case #{i}: {x[-1]}")
