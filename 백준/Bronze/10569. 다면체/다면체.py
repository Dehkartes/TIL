for _ in range(int(input())):
	vertical, edge = map(int, input().split())
	print(edge - vertical + 2)