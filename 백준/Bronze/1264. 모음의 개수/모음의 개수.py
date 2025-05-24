while True:
	cnt = 0
	for i in input():
		i = i.lower()
		if i == "#":
			exit()
		elif i == "a" or i == "e" or i == "i" or i == "o" or i == "u":
			cnt += 1
	print(cnt)
