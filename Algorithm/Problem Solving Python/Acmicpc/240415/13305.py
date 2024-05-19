'''
46236kb 116ms

n위치에서 n+1로 갈 때 n-1의 비용보다 크면 n-1에서주유 아니면 n에서 주유
'''

from sys import stdin
input = stdin.readline

k = int(input())

dist = list(map(int, input().split()))
cost = list(map(int, input().split()))
result = 0

c = cost[0]
for i in range(k - 1):
	if c > cost[i]: # 이전 비용이 현재 비용보다 크면 현재비용으로 갱신
		c = cost[i]

	result += c * dist[i]

print(result)