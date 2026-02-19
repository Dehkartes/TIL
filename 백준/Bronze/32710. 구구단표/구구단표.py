x = int(input())

if 1 <= x <= 9:
	print(1)

else:
	for i in range(1, 10):
		for j in range(1, 10):
			if i * j == x:
				print(1)
				exit()
	print(0)

