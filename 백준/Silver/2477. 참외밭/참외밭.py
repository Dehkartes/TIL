# 가장 긴변의 인접한 두 변을 기준으로 한다
# 두개 변의 인접한 변 중에서 작은것과 곱하기
# 곱한 값을 합하면 답
from sys import stdin
input = stdin.readline

vec = []

rate = int(input())
mxIdx = 0

for i in range(0, 6):
	length = list(map(int, input().split()))[1]
	if len(vec) > 0 and vec[mxIdx] < length:
		mxIdx = i

	vec.append(length)

pSide = mxIdx - 1
sSide = mxIdx + 1

if sSide == 6:
	sSide = 0

post = sSide + 1

if post == 6:
	post = 0

a = vec[pSide] * min(vec[pSide - 1], vec[pSide + 1]) 
b = vec[sSide] * min(vec[sSide - 1], vec[post])
print(( a + b ) * rate)