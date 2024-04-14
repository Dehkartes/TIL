'''
리스트로 3진트리 구현
'''

from collections import deque

coor = [0] * 100001

def BFS(n: int, k: int):
	
	queue = deque()
	queue.append(n)
	
	while queue:

		cur = queue.popleft()

		if cur == k:
			return coor[cur]
		
		for i in (cur + 1, cur - 1, cur * 2):
			if 0 <= i <= 100000 and not coor[i]:
				coor[i] = coor[cur] + 1
				queue.append(i)

a, b = map(int, input().split())
print(BFS(a, b))