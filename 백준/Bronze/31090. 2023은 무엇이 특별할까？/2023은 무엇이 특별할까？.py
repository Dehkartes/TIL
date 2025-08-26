for _ in range(int(input())):
	x = input()
	if (int(x) + 1) % int(x[2:]) == 0:
		print("Good")
	else:
		print("Bye")