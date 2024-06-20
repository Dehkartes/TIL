import heapq
import sys


arr = []
n = int(input())
for _ in range(n):
	heapq.heappush(arr, int(sys.stdin.readline()))

for _ in range(n):
	sys.stdout.write(f"{heapq.heappop(arr)}\n")