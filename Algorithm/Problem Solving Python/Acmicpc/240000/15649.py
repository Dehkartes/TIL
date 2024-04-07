# 34772 kb 128 ms

from sys import stdin
read = stdin.readline

n, m = map(int, read().split())

visited = [False] * n
answers = []
answer = []

def back_tracking(index, n, m):
	if index == m:
		answers.append(' '.join(map(str, answer)))
		return
	for i in range(n):
		if not visited[i]:
			visited[i] = True
			answer.append(i+1)
			back_tracking(index+1, n, m)
			visited[i] = False
			answer.pop()

back_tracking(0, n, m)
print('\n'.join(answers))