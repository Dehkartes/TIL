'''
33188kb 48ms

최소힙에 (추천수, 들어온순서, 번호) 로 저장
길이가 3 이상이고 힙에 번호가있으면 번호를 추천수 갱신, 힙파이실행
아니면 힙팝하고 힙에넣기 
'''
from heapq import *

n = int(input())
input()

data = []
for i, num in enumerate(list(map(int, input().split()))):
	find = True
	idx = list(filter(lambda x: data[x][2] == num, range(len(data)))) # 힙에 번호가 있는지 검사

	if len(idx) == 0:
		if len(data) >= n:
			heappop(data)
		heappush(data, (1, i, num))

	else:
		recommand, ii, nm = data.pop(idx[0])
		data.append((recommand + 1, ii, nm))
		heapify(data)

for i in sorted(data, key=lambda x: x[2]):
	print(i[2], end=' ')