'''
31120kb 44ms

i일 때 최소비용은 i색비용 + min(i색과 다른색, i색과 다른색2)
'''
import sys

input = sys.stdin.readline

n = int(input())

data = []
for _ in range(n):
	data.append(list(map(int, input().split())))

dp = [[data[0][0], data[0][1], data[0][2]]]

for i in range(1, n):
	dp.append([
		min(data[i][0] + dp[i - 1][1], data[i][0] + dp[i - 1][2]),
		min(data[i][1] + dp[i - 1][0], data[i][1] + dp[i - 1][2]),
		min(data[i][2] + dp[i - 1][0], data[i][2] + dp[i - 1][1])
		])

print(min(dp[n - 1]))