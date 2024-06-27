# 문제개수를 키, 패널티리스트를 값으로 딕셔너리 저장
# 키를 따로 힙정렬
# 키에대한 패널티 리스트를 순회할때등수 기록 및 리스트에서 순회한 횟수 기록
# 5번 째 순회(5등)인 경우 순회 종료
# 5번 째 순회일 때 패널티 리스트의 길이 - 리스트 순회 횟수 가 정답
from collections import defaultdict
from heapq import *

data  = defaultdict(list)

for _ in range(int(input())):
	count, panalty = map(int, input().split())
	data[count].append(panalty)

rank = 0
temp = []

for i in data.keys():
	heappush(temp, -i)

itercount = 0 
x = 0
while temp:
	isBreak = False
	cur = temp[0]
	itercount = 0
	for i in data[-cur]:
		itercount += 1
		rank += 1
		if rank == 5:
			x = -cur
			isBreak = True
			break
	heappop(temp)
	if isBreak:
		break


print(len(data[x]) - itercount)