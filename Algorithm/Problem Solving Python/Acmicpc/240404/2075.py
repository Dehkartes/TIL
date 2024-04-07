"""
33188kb 1316ms

최소 힙을 사용
힙 크기를 N으로 유지 -> 최소힙의 노드는 N번째 작은 수
힙크기 < N 일 때 삽입
힙크기 >= N 일 때 삽입하려는 수가 노드보다 클 때 노드를 지우고 삽입
"""

from heapq import *

data = []
n = int(input())
for _ in range(n):
	for i in map(int, input().split()):
		if len(data) >= n and data[0] < i:
			heappop(data)
			heappush(data, i)
		elif len(data) < n:
			heappush(data, i)

print(data[0])