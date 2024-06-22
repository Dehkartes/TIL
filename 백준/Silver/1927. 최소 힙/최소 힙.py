import sys
import heapq

input = sys.stdin.readline
print = sys.stdout.write

arr = []
for i in range(int(input())):
	x = int(input())

	if x == 0:
		if len(arr) == 0:
			print("0\n")
		else:
			print(f"{heapq.heappop(arr)}\n")
	
	else:
		heapq.heappush(arr, x)



