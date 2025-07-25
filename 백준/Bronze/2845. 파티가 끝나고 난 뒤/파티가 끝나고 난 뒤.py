a, b = map(int, input().split())
x = a * b
result = []
for i in map(int, input().split()):
	result.append(i - x)

print(*result)