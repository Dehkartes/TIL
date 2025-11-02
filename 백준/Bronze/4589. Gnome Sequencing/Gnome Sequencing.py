print("Gnomes:")
for _ in range(int(input())):
	x = list(map(int, input().split()))
	y = sorted(x)

	if x == y or list(reversed(x)) == y:
		print("Ordered")
	else:
		print("Unordered")