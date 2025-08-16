input()
result = 0
for i in map(float, input().split()):
	result += i ** 3

print(result ** (1 / 3))