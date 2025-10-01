num_y = 0
num = 0

for i in input():
	if i in "aeiou":
		num += 1
		num_y += 1
	elif i == 'y':
		num_y += 1

print(*[num, num_y])