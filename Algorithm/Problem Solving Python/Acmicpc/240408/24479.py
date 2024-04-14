'''
60756kb 544ms

dfs 구현
'''
import sys
input = sys.stdin.readline

n, m, r = map(int, input().split())
graph = [[] for _ in range(n + 1)]
for _ in range(m):
	a, b = map(int, input().split())
	graph[a].append(b)
	graph[b].append(a)
	
# 스택에서 오름차순으로 꺼내기 위해 내림차순으로 정렬
for i in range(1, len(graph)):
	graph[i].sort(reverse=True)

def DFS(start):
	stack = [start]
	visit = [-1] * (n + 1)
	result = [0] * (n + 1)
	count = 1
	
	while stack:
		cnt_node = stack.pop()
		if visit[cnt_node] == 1:
			continue
		
		visit[cnt_node] = 1
		
		result[cnt_node] = count
		count += 1

		for adj_node in graph[cnt_node]:
			if visit[adj_node] == -1:
				stack.append(adj_node)
	
	return result

print(*DFS(r)[1:], sep="\n")