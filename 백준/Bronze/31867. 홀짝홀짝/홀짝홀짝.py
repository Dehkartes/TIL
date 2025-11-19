input()

a = 0
b = 0

for i in input():
	if int(i) % 2 == 0:
		b += 1
	else:
		a += 1

if a > b:
	print(1)
elif a < b:
	print(0)
else:
	print(-1)