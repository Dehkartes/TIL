'''
70528kb 660ms

산술평균, 중앙값은 statistics 함수 사용
최빈값은
 1. 카운터로 각 요소의 개수를 구하고 가장 개수가 많은 요소의 개수를 mx로 설정
 2. 데이터를 정렬한 뒤 개수가 mx가 아닌 요소 삭제
 3. 데이터의 길이가 1을 초과하면 데이터의 두 번째 요소가 최빈값 아니면 첫 번째 요소가 최빈값
범위는 데이터의 최대 - 최소
'''

import sys
import statistics
from collections import Counter

input = sys.stdin.readline

data = [int(input()) for _ in range(int(input()))]

data.sort()
ctr = Counter(data)
mx = ctr[max(ctr, key=ctr.get)]
ctr = list(ctr.items())

for i in range(len(ctr) - 1, -1, -1):
	if ctr[i][1] != mx:
		del ctr[i]

mode = 0
if 1 < len(ctr):
	mode = ctr[1][0]
else:
	mode = ctr[0][0]

print(round(statistics.mean(data)))
print(statistics.median(data))
print(mode)
print(max(data) - min(data))