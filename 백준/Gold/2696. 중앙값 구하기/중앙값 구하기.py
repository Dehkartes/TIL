from heapq import *
from sys import stdin

input = stdin.readline


def Middle(maxHeap, minHeap, num: int):
	if len(maxHeap) == len(minHeap):
		if num > minHeap[0]:
			heappush(maxHeap, -heappop(minHeap))
			heappush(minHeap, num)
		else:
			heappush(maxHeap, -num)
	else:
		if num < -maxHeap[0]:
			heappush(minHeap, -heappop(maxHeap))
			heappush(maxHeap, -num)
		else:
			heappush(minHeap, num)
			

for _ in range(int(input())):
	mxHeap = []
	mnHeap = []
	x = int(input())
	count = 0
	printCount = 1
	numList = []

	print(f"{(x + 1) // 2}")

	for i in range(x // 10):
		for j in map(int, input().split()):
			numList.append(j)

	if x % 10 != 0:
		for i in map(int, input().split()):
			numList.append(i)

	if len(numList) == 1:
		mxHeap.append(-numList[0])
	elif numList[0] > numList[1]:
		mxHeap.append(-numList[1])
		mnHeap.append(numList[0])
	else:
		mxHeap.append(-numList[0])
		mnHeap.append(numList[1])

	res = [numList[0]]
	for i in range(2, len(numList)):
		count += 1
		Middle(mxHeap, mnHeap, numList[i])
		if count % 2 != 0:
			res.append(-mxHeap[0])
	print(*res)