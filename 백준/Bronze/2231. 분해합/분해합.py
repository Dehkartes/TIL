n = int(input())
for i in range(1, n + 1):
	result = i + sum(map(int, str(i)))

	if result == n:
		print(i)
		exit()

print(0)