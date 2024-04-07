"""
36124kb 76ms

최소힙으로 합체수만큼 팝한 결과를 더하고 힙에 푸시
배열의 합이 가장 작은 점수
"""

from heapq import *
from collections import defaultdict

n, merge = map(int, input().split())

data = []
for i in map(int, input().split()):
	heappush(data, i)

result = 0
for _ in range(merge):
	x = heappop(data)
	y = heappop(data)
	heappush(data, x + y)
	heappush(data, x + y)

result += sum(data)

print(result)