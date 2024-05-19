'''


구현, BFS로 물고기까지의 최단경로 탐색하기
'''

import sys
from collections import deque
sys.stdin = open("C:\Workspace\GitHub\TIL\Algorithm\Problem Solving Python\Acmicpc\input.txt")
input = sys.stdin.readline

def findBaby(matrix: list[list[int]]):
	for i in range(len(matrix)):
		for j in range(len(matrix)):
			if matrix[i][j] == 9:
				return (i, j)

def eat(r, c, size, n):
	distance = [[0] * n for _ in range(n)]
	visited = [[0] * n for _ in range(n)]
	q = deque()
	q.append((r, c))
	visited[r][c] = 1
	result = []
	while q:
		curR, curC = q.popleft()
		for dR, dC in [(0, 1), (0, -1), (1, 0), (-1, 0)]:
			row = curR + dR
			col = curC + dC
			if 0 <= row < n and 0 <= col < n and visited[row][col] == 0:
				if graph[row][col] <= size:
					q.append((row,col))
					visited[row][col] = 1
					distance[row][col] = distance[curR][curC] + 1
					if graph[row][col] < size and graph[row][col] != 0:
						result.append((row, col, distance[row][col]))

	return sorted(result, key=lambda x: (-x[2],-x[0],-x[1])) # 거리, 가장위, 가장 왼쪽

n = int(input())
graph = []
for _ in range(n):
	graph.append(list(map(int,input().split())))

r = 0
c = 0
size = 2
count = 0
result = 0
while True:
	data = eat(r, c, size, n)
	if len(data) == 0:
		break

	result += data[-1][2]
	graph[r][c] = 0
	graph[data[-1][0]][data[-1][1]] = 0
	r = data[-1][0] 
	c = data[-1][1]
	count += 1

	if count == size:
		size += 1
		count = 0

print(result)