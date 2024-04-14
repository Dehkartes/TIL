'''
31120kb 1992ms

1.먼지확산
2.공기청정기로 먼지 1칸씩 옮기기
3. 1, 2를 초만큼 반복
'''

r, c, t = map(int, input().split())

data = []
for _ in range(r):
	data.append(list(map(int, input().split())))

airR = []
for i in range(r):
	if data[i][0] == -1:
		airR.append(i)

def spread(data: list[list[int]], r, c):
	stack = []
	for row in range(r):
		for col in range(c):
			if data[row][col] != 0:
				stack.append((row, col, data[row][col]))
	while stack:
		row, col, val = stack.pop()
		dust = int(val / 5)
		count = 0

		if row - 1 >= 0 and data[row - 1][col] != -1:
			count += 1
			data[row - 1][col] += dust
		if row + 1 < r and data[row + 1][col] != -1:
			count += 1
			data[row + 1][col] += dust
		if col - 1 >= 0 and data[row][col - 1] != -1:
			count += 1
			data[row][col - 1] += dust
		if col + 1 < c and data[row][col + 1] != -1:
			count += 1
			data[row][col + 1] += dust

		data[row][col] -= dust * count 

def airclean(airR1, airR2, r, c):
	if airR1 == 0:
		for i in range(c - 2, 1, -1):
			if i == c - 2:
				data[0][c - 1] += data[0][c - 2]
			else:
				data[0][i + 1] = data[0][i]
	else:
		data[airR1 - 1][0] = 0
		for i in range(airR1 - 1, 0, -1):
			data[i][0] = data[i - 1][0]
		for i in range(c - 1):
			data[0][i] = data[0][i + 1]
		for i in range(0, airR1):
			data[i][c - 1] = data[i + 1][c - 1]
		for i in range(c - 1, 1, -1):
			data[airR1][i] = data[airR1][i - 1]
		data[airR1][0] = 0
		data[airR1][1] = 0
			
	if airR2 == r - 1:
		for i in range(c - 2, 1, -1):
			if i == c - 2:
				data[r - 1][c - 1] += data[r - 1][c - 2]
			else:
				data[r - 1][i + 1] = data[r - 1][i]
	else:
		data[airR2 + 1][0] = 0
		for i in range(airR2 + 1, r - 1, 1):
			data[i][0] = data[i + 1][0]
		for i in range(c - 1):
			data[r - 1][i] = data[r - 1][i + 1]
		for i in range(r - 1, airR2 - 1, -1):
			data[i][c - 1] = data[i - 1][c - 1]
		for i in range(c - 1, 1, -1):
			data[airR2][i] = data[airR2][i - 1]
		data[airR2][0] = 0
		data[airR2][1] = 0

for _ in range(t):
	spread(data, r, c)
	airclean(airR[0], airR[1], r, c)

result = 0
for i in range(r):
	for j in range(c):
		result += data[i][j]

print(result)