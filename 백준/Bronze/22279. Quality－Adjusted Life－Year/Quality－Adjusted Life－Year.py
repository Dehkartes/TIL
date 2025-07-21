result = 0

for _ in range(int(input())):
	a, b = map(float, input().split())

	result += a * b

print(result)