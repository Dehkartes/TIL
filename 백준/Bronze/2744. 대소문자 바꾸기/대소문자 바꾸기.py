for i in input():
	if ord("a") <= ord(i) <= ord("z"):
		print(i.upper(), end="")
	else:
		print(i.lower(), end="")