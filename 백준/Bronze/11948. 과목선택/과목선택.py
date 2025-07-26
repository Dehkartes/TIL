result = 0
min = 101
for _ in range(4):
	x = int(input())
	if min > x:
		min = x

	result += x

result -= min
min = 101
for _ in range(2):
	x = int(input())
	if min > x:
		min = x

	result += x

print(result - min)
