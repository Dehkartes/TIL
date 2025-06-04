data = []

for _ in range(int(input())):
	x = int(input())

	if x == 0:
		del data[-1]
	else:
		data.append(x)

print(sum(data))