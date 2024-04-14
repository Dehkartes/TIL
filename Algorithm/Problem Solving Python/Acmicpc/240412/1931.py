'''
59068kb 288ms

회의가 빨리 끝난다 -> 이후에 시간이 많으며 더 많은 회의를 진행할 수 있다
끝나는 시간이 같은경우 -> 먼저 시작하는 회의부터 진행
'''

import sys
input = sys.stdin.readline

data = []
result = [[0, 0]]
for _ in range(int(input())):
	data.append(list(map(int, input().split())))

data.sort(key=lambda x: (x[1], x[0]))

for i in data:
	if i[0] >= result[-1][1]: # 저장된 회의보다 i의 시작 시간이 같거나 크다면
		result.append(i)

print(len(result) - 1)