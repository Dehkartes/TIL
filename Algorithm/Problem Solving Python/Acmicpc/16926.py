# 112192kb 764ms

import sys
input = sys.stdin.readline

n, m, r = map(int, input().split())

temp = ""
turn = min(n, m) // 2

data = []

for i in range(n):
	data.append(list(map(int, input().split())))

for _ in range(r):
	for i in range(turn):
		row = i
		col = i
		nextVal = data[row][col]
		mxrow = n - i * 2
		mxcol = m - i * 2
		for _ in range(mxrow - 1):
			data[row + 1][col], nextVal = nextVal, data[row + 1][col] # ↓
			row += 1

		for _ in range(mxcol - 1):
			data[row][col + 1], nextVal = nextVal, data[row][col + 1] # →
			col += 1

		for _ in range(mxrow - 1):
			data[row - 1][col], nextVal = nextVal, data[row - 1][col] # ↑
			row -= 1
			
		for _ in range(mxcol - 1):
			data[row][col - 1], nextVal = nextVal, data[row][col - 1] # ←
			col -= 1

for i in data:
	print(*i)