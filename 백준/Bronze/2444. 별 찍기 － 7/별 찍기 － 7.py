n = int(input())

for i in range(n):
	print(" " * (n - i - 1) + "*" * (1 + i * 2))

for i in range(n - 2, -1, -1):
	print(" " * (n - i - 1) + "*" * (1 + i * 2))