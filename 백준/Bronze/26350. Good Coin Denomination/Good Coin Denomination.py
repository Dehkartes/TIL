for _ in range(int(input())):
	x = list(map(int, input().split()))
	before = x[1]
	strs = ""
	end = False
	for i in x[1:]:
		strs += f"{i} "
	
	for i in x[2:]:
		if before * 2 > i:
			end = True
		before = i
	
	print(f"Denominations: {strs}\n{"Good" if not end else "Bad"} coin denominations!\n")
	