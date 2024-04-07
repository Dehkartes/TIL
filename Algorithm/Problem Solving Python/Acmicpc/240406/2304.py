'''
31120kb 80ms

1. mx1, mx2 = 지붕이 최대인구간의 시작점, 끝점
2. 0번인덱스 ~ mx1까지
	1. i = 현재기둥 인덱스
	2. l = i보다 오른쪽에 있는 기둥 중에서 높이가 더 높은 기둥을 처음 만난 위치
	3. i부터 l까지의 의 너비 구하기((l - i) * i 높이)
	4. 최대 기둥까지 반복, result = 3연산의 총합
3. mx2 ~ 나머지까지
	2. 나머지부터 mx2까지 거꾸로 순회하면서 2번과정 실행
'''

data = [list(map(int, input().split())) for _ in range(int(input()))]
data.sort(key=lambda x:x[0])
mx = max(data, key= lambda x: x[1])

mxList = []
for i, val in enumerate(data):
	if val[1] == mx[1]:
		mxList.append(i)

mx1 = mxList[0]
mx2	= mxList[-1]

i = 0
l = 0
result = 0
while l != mx2:
	l += 1
	if data[i][1] < data[l][1]:
		result += (data[l][0] - data[i][0]) * data[i][1]
		i = l
	
	if l == mx1:
		break

stop = l
i = len(data) - 1
l = i
while l != mx2:
	l -= 1
	if data[i][1] < data[l][1]:
		result += (data[i][0] - data[l][0]) * data[i][1]
		i = l
	
	if l == mx2:
		break

result += (data[mx2][0] - data[mx1][0] + 1) * mx[1]

print(result)