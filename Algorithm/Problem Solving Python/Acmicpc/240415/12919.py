'''
34000kb 68ms

1. T의 마지막이 A면 마지막지움
2. T의 처음이 B면 뒤집고 T[0]지움

BFS로 완전탐색하기
'''

from collections import deque

queue = deque()

s = input()

queue.append(input())

while queue:
	t = queue.popleft()

	if len(t) > 0 and t[-1] == "A":
		x = t[:-1]
		if x == s:
			print(1)
			exit()
		queue.append(x)

	if len(t) > 0 and t[0] == "B":
		x = t[1:][::-1]
		if x == s:
			print(1)
			exit()
		queue.append(x)

print(0)