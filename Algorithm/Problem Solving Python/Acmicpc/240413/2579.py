'''
31252kb 40ms
n[i] = max(score[i - 1] + dp[i - 3], dp[i - 2]) + score[i]
'''

import sys
input = sys.stdin.readline

score = [0]

n = int(input())
for _ in range(n):
	score.append(int(input()))

dp = [0]


if n == 1:
	print(score[1])
	exit()
elif n == 2:
	print(score[1] + score[2])
	exit()

dp.append(score[1])
dp.append(score[1] + score[2])

result = 0
for i in range(3, n + 1):
	dp.append(max(score[i - 1] + dp[i - 3], dp[i - 2]) + score[i])

print(dp[-1])