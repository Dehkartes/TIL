def Solution(x):
	a, b = 1, 0
	for _ in range(x):
		a, b = b, a + b

	return(a, b)

for _ in range(int(input())):
	print(*Solution(int(input())))