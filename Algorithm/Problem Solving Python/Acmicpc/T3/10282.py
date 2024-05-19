'''
50080kb 944ms

디익스트라 최단경로 구하기
'''
import sys
from heapq import *

input = sys.stdin.readline

def dijkstra(start, distance, graph):
	heap = []
	heappush(heap, [0, start])
	distance[start] = 0
	while heap:
		weight, node = heappop(heap)
		for nextNode, w in graph[node]:
			nextWeight = w + weight
			if nextWeight < distance[nextNode]:
				distance[nextNode] = nextWeight
				heappush(heap, [nextWeight, nextNode])
				
for _ in range(int(input())):
	n, d, c = map(int, input().split())
	graph = [[] for _ in range(n  + 1)]
	distance = [sys.maxsize] * (n + 1)
	for _ in range(d):
		a, b, s = map(int, input().split())
		graph[b].append([a, s])

	dijkstra(c, distance, graph)

	count = 0
	result = 0
	for i in distance:
		if i != sys.maxsize:
			count += 1
			result = max(result, i)
	print(count, result)