'''
154544kb 2640ms

입력 배열을 힙에넣고 (키: 입력값, 벨류: 힙에서 나온 순서)인 딕셔너리 생성, 키를 압축한 좌표가 벨류가됨
입력 배열의 인덱스의 요소를 딕셔너리[인덱스의 요소]로 변환
'''

from heapq import *

sel = {}
heap = []
input()
data = list(map(int, input().split()))

for i in set(data): # 중복제거위한 set
	heappush(heap, i)

for i in range(len(heap)):
	x = heappop(heap)
	sel[x] = i

for i in range(len(data)):
	data[i] = sel[data[i]]

print(*data)