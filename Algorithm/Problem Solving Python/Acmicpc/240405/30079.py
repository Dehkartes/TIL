'''
34972kb 1080ms

접근법
n명이 심사하는데 걸리는 최대 시간이 아닌 k시간동안 최대 몇 명을 심사 가능한가? -> 주어진 시간을 심사대가 걸리는 시간으로 나눈합
로직
k시간동안 심사 가능한 최대 인원이 m명 이상이면 시간줄이기
k시간동안 심사 가능한 최대 인원이 m명 이하면 시간 늘리기
이진탐색으로 최대 인원이 m명인 심사시간 k 찾기
최소 시간은 한 명이 심사 시간이 최소인 심사대에서 심사받는 시간
최대 시간은 모두가 심사 시간이 최대인 심사대에서 심사받는 시간
'''

import sys
input = sys.stdin.readline

n, m = map(int, input().split()) #심사대 수, 친구 수
desk = [int(input().rstrip()) for _ in range(n)]

mn = min(desk)
mx = max(desk) * m
result = mx
while mn <= mx:
	md = (mn + mx) // 2

	# count: md시간 동안 검사가능한 최대 인원
	count = 0
	for i in desk:
		count += md // i
	
	if m <= count:
		mx = md - 1
		result = min(result, md)
	else:
		mn = md + 1


print(result)