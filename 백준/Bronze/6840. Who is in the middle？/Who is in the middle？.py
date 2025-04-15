import heapq

x = []

for _ in range(3):
	heapq.heappush(x, int(input()))

heapq.heappop(x)
print(heapq.heappop(x))