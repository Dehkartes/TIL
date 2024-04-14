'''
57372kb	284ms

기본적인 디익스트라
'''

import sys
import heapq

input = sys.stdin.readline

def dijkstra(start):
	heap = []
	distance[start] = 0 # 시작점-시작점까지의 가중치는 0
	heapq.heappush(heap, (0, start)) # 시작 노드(가중치, 노드번호)를 힙에 푸시

	#힙에 원소가 없을 때 까지 반복.
	while heap:
		weight, cur = heapq.heappop(heap)

		#현재 테이블과 비교하여 불필요한(가중치가 더 큰) 튜플이면 무시.
		if distance[cur] < weight:
			continue

		for w, next_node in graph[cur]:
			#현재 정점 까지의 weight + 현재 정점에서 다음 정점(next_node)까지의 가중치 W
			# = 다음 노드까지의 가중치(next_wei)
			next_wei = w + weight
			#다음 노드까지의 가중치(next_wei)가 현재 기록된 값 보다 작으면 조건 성립.
			if next_wei < distance[next_node]:
				#계산했던 next_wei를 가중치 테이블에 업데이트.
				distance[next_node] = next_wei
				#다음 점 까지의 가증치와 다음 점에 대한 정보를 튜플로 묶어 최소 힙에 삽입.
				heapq.heappush(heap, (next_wei, next_node))

	return distance

N = int(input())
M = int(input())

#가중치 테이블 distance
INF = sys.maxsize
distance = [INF]*(N+1)
graph = [[] for _ in range(N + 1)]

#초기화
for _ in range(M):
	o, v, w = map(int, input().split())
	#(가중치, 목적지 노드) 형태로 저장
	graph[o].append((w, v))

#시작점 K
start, end = map(int, input().split())
distance = dijkstra(start) # 시작점을 기준으로 각 노드까지 최단거리를 distance에 저장

print(distance[end])