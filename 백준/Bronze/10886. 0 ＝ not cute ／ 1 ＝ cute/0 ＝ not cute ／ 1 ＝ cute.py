a = 0
b = 0

for _ in range(int(input())):
	if input() == '0':
		a += 1
	else:
		b += 1

print("Junhee is not cute!" if a > b else "Junhee is cute!")