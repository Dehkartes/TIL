'''

'''
import sys
from collections import defaultdict
from heapq import *
input = sys.stdin.readline

n, m = map(int, input().split())

data = [[sys.maxsize for _ in range(n + 1)] for _ in range(n + 1)]
distance = [sys.maxsize for _ in range(n + 1)]
queue = []

for _ in range(m):
	r, c, v = map(int, input().split())
	data[r][c] = v
	data[c][r] = v

heappush(queue, (0, 1))
distance[1] = 0

while queue:
	d, cur = heappop(queue)
	if distance[cur] < d:
		continue
	for i in range(n + 1):
		cost = d + data[cur][i]
		if cost < distance[i]:
			distance[cur] = cost
			heappush(queue, (cost, cur))

print(distance)