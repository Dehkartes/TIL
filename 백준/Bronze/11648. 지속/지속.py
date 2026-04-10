num = input()

phase = 0

while True:
	if len(num) < 2:
		break
	phase += 1
	x = 1
	for i in num:
		x *= int(i)
	
	num = str(x)


print(phase)