x = input()

if not '7' in x:
	if int(x) % 7 != 0:
		print(0)
	else:
		print(1)
else:
	if int(x) % 7 != 0:
		print(2)
	else:
		print(3)