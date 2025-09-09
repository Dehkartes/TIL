x = input()
while True:
	if len(x) > 9:
		print(x[0:10])
		x = x[10:]
	else:
		print(x)
		break