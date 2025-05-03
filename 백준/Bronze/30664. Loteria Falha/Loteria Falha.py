while True:
	x = int(input())
	if x == 0:
		exit()
	print("PREMIADO" if x % 42 == 0 else "TENTE NOVAMENTE")
