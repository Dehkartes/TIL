'''
31252kb 44ms

dp로 구하기
'''

dp = [0, 1, 3, 5]

n = int(input())
for i in range(4, n + 1):
	dp.append(dp[i - 1] + 2 * dp[i - 2])

print(dp[n] % 10007)