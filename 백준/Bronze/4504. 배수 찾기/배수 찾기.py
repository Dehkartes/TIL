x = int(input())

while True:
	i = int(input())
	
	if i == 0:
		break

	if i % x != 0:
		print(f"{i} is NOT a multiple of {x}.")
	else:
		print(f"{i} is a multiple of {x}.")