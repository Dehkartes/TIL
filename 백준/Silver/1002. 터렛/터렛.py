def findLocation(x1, y1, r1, x2, y2, r2):
	if x1 == x2 and y1 == y2 and r1 == r2:
		return -1
	delta = ((x2 - x1)**2 + (y2 - y1)**2)**0.5
	
	if delta < max(r1, r2):
		data = [[x1, y1, r1], [x2, y2, r2]] if r1 < r2 else[[x2, y2, r2], [x1, y1, r1]]
		smallMax = delta + data[0][2]
		if data[1][2] < smallMax:
			return 2
		elif data[1][2] == smallMax:
			return 1
		else:
			return 0

	x = delta - r2 < r1
	if x:
		return 2
	elif delta - r2 == r1 :
		return 1
	else:
		return 0

for i in range(int(input())):
	x = list(map(int, input().split()))
	print(findLocation(x[0], x[1], x[2], x[3], x[4], x[5]))