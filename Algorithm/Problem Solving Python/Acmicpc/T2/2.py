'''
작은 크기부터 더하기
파일 힙으로
힙에서 두 번 팝, 연산하고 힙에 푸시
힙길이가 1이면 루프끝
'''

import sys
input = sys.stdin.readline
from heapq import *

for _ in range(int(input())):
	input()
	data = list(map(int, input().split()))
	heapify(data)
	
	result = 0
	while len(data) > 1:
		x1 = heappop(data)
		x2 = heappop(data)
		y = x1 + x2
		result += y
		heappush(data, y)
	
	print(result)