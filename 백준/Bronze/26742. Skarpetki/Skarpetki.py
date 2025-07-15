b = 0
c = 0
for i in input():
	if i == "B":
		b += 1
	else:
		c += 1

print((b // 2) + (c // 2))