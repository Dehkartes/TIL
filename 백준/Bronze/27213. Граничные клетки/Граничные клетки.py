m = int(input())
n = int(input())

if m == 1 or n == 1:
	print(m * n)
	exit()

print((m * 2) + (n * 2) - 4)