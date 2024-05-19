'''
47840kb 776ms

dp를 2행으로, i번째의 최대는 max(0행, 1행)
점화식: i = max(다른행의 i - 2, 다른행의 i - 1)
'''
import sys
input = sys.stdin.readline

for _ in range(int(input())):
	n =  int(input())

	data = []
	data.append(list(map(int, input().split())))
	data.append(list(map(int, input().split())))

	dp = [[0] * n for _ in range(2)]

	dp[0][0] = data[0][0]
	dp[1][0] = data[1][0]

	if n == 1:
		print(max(dp[0][0], dp[1][0]))
		continue

	dp[0][1] = data[1][0] + data[0][1]
	dp[1][1] = data[0][0] + data[1][1]

	if n == 2:
		print(max(dp[0][1], dp[1][1]))
		continue

	for i in range(2, n):
		dp[0][i] = max(dp[1][i - 2], dp[1][i - 1]) + data[0][i]
		dp[1][i] = max(dp[0][i - 2], dp[0][i - 1]) + data[1][i]

	print(max(dp[0][-1], dp[1][-1]))