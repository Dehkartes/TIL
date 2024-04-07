'''
37044kb 212ms

최대힙에 넣고 최대힙에서 나오는 요소를 뿅망치로 때리기
'''
import sys
from heapq import *
input = sys.stdin.readline

n, m, t = map(int, input().split()) # 거인수, 키, 망치수

data = []
for _ in range(n):
	heappush(data, -int(input()))

count = 0
while t > 0 and -data[0] >= m: #t 만큼 망치 사용
	t -= 1
	count += 1
	if -data[0] > 1:
		heappush(data, heappop(data) / 2)

print("YES" + "\n" + str(count)) if m > -data[0] else print("NO" + "\n" + str(int(-data[0])))