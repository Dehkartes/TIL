import sys
import heapq

while True:
	arr = list(map(int, sys.stdin.readline().split()))
	if arr[0] == 0 and arr[1] == 0 and arr[2] == 0:
		break

	heapq.heapify(arr)
	x = heapq.heappop(arr) 
	y = heapq.heappop(arr)
	z = heapq.heappop(arr)
	if x**2 + y**2 != z**2:
		sys.stdout.write("wrong\n")
	else:
		sys.stdout.write("right\n")
