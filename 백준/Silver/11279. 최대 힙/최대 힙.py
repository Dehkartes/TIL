import heapq
import sys

input = sys.stdin.readline

heap = []

for _ in range(int(input())):
	i = int(input())
	if len(heap) > 0 and i == 0:
		sys.stdout.write(str(-heapq.heappop(heap)) + '\n')
	elif i == 0 :
		print(0)
	else:
		heapq.heappush(heap, -i)