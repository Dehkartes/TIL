def countHansu(n: int):
	if n < 100:
		return n
	
	cnt = 99

	for i in range(100, n + 1):
		x = str(i)
		if int(x[1]) - int(x[0]) == int(x[2]) - int(x[1]):
			cnt += 1
	
	return cnt

print(countHansu(int(input())))