'''
33188kb 44ms

1. 2번 후보부터 최대 힙에 삽입
2. x = 힙에서 팝, count = 0
3. x가 1번후보보다 크거나 같으면 -1, 최대힙삽입, 2번후보 +1, count++
4. 2번후보 > x 일 때 까지 반복
'''

import sys
import heapq
input = sys.stdin.readline

data = []
n = int(input()) - 1
one = int(input())
for _ in range(n):
	heapq.heappush(data, -int(input()))

count = 0
while data and one <= -data[0]:
	heapq.heappush(data, heapq.heappop(data) + 1)
	one += 1
	count += 1

print(count)