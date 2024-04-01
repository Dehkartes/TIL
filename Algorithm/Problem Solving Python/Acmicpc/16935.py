# 31120kb 1588ms

import sys
input = sys.stdin.readline

def createList(n, m):
	return [[0 for _ in range(m)] for _ in range(n)]

def divideTo4(n, m):
	return (
		((0, 0), (n // 2 - 1, m // 2 - 1)),
		((0, m // 2), (n // 2 - 1, m)),
		((n // 2, m // 2),(n, m)),
		((n // 2, 0), (n, m // 2 - 1))
		)

def solution(n: int, m: int, data: list, type: int):
	result = []
	match type:
		case 1:
			return data[-1::-1]
		case 2:
			for i in data:
				result.append(i[-1::-1])
		case 3:
			result = createList(m, n)
			for i in range(m):
				for j in range(n):
					result[i][j] = data[n - 1 - j][i]
		case 4:
			result = createList(m, n)
			for i in range(m):
				for j in range(n):
					result[i][j] = data[j][m - 1 - i]
		case 5:
			area = divideTo4(n, m) # [area, min or max, row or col]
			result = createList(n, m)
			for i in range(n):
				for j in range(m):
					if area[0][0][0] <= i <= area[0][1][0] and area[0][0][1] <= j <= area[0][1][1]:
						result[i][j + area[1][0][1] - area[0][0][1]] = data[i][j]
					elif area[1][0][0] <= i <= area[1][1][0] and area[1][0][1] <= j <= area[1][1][1]:
						result[i + area[2][0][0] - area[1][0][0]][j] = data[i][j]
					elif area[2][0][0] <= i <= area[2][1][0] and area[2][0][1] <= j <= area[2][1][1]:
						result[i][j - (area[2][0][1] - area[3][0][1])] = data[i][j]
					elif area[3][0][0] <= i <= area[3][1][0] and area[3][0][1] <= j <= area[3][1][1]:
						result[i - (area[3][0][0] - area[0][0][0])][j] = data[i][j]
		case 6:
			area = divideTo4(n, m) # [area, min or max, row or col]
			result = createList(n, m)
			for i in range(n):
				for j in range(m):
					if area[0][0][0] <= i <= area[0][1][0] and area[0][0][1] <= j <= area[0][1][1]:
						result[i + area[3][0][0] - area[0][0][0]][j] = data[i][j]
					elif area[1][0][0] <= i <= area[1][1][0] and area[1][0][1] <= j <= area[1][1][1]:
						result[i][j - (area[1][0][1] - area[0][0][1])] = data[i][j]
					elif area[2][0][0] <= i <= area[2][1][0] and area[2][0][1] <= j <= area[2][1][1]:
						result[i - (area[2][0][0] - area[1][0][0])][j] = data[i][j]
					elif area[3][0][0] <= i <= area[3][1][0] and area[3][0][1] <= j <= area[3][1][1]:
						result[i][j + area[2][0][1] - area[3][0][1]] = data[i][j]
	return result

n, m, count = map(int, input().split())
li = []

for _ in range(n):
	li.append(list(map(int, input().split())))

for i in map(int, input().split()):
	li = solution(n, m, li, i)
	if i == 3:
		n, m = m, n
	elif i == 4:
		n, m = m, n
for i in li:
	print(*i)