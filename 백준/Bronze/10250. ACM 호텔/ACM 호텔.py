def checkIn(text):
	h, w, n = map(int, text.split())

	if n % h == 0:
		posH = h
		posW = n // h
	else:
		posH = n % h
		posW = n // h + 1

	return(int("%02d%02d" % ( posH, posW)))

for _ in range(int(input())):
	print(checkIn(input()))