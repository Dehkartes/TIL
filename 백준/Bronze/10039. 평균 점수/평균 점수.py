total = 0

for _ in range(5):
	x = int(input())
	if x < 40:
		x = 40
	total += x

print(total // 5)