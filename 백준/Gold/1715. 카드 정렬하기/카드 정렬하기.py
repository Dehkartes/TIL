import sys
import heapq

arr = []
for i in range(int(input())):
	heapq.heappush(arr, int(input()))

res = 0
while len(arr) > 1:
	x = heapq.heappop(arr) + heapq.heappop(arr)
	res += x
	heapq.heappush(arr, x)

print(res)