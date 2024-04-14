'''
31120kb 152ms

수열[i]까지의 감소하는 부분 수열의 길이가 k일때 i보다 왼쪽에있으면서 수열[i]보다 작은 첫 번째 수까지의 감소하는 부분 수열 길이는 k + 1
'''

n = int(input())
data = list(map(int, input().split()))

dp = [1] * n

for i in range(1, n):
	for j in range(i):
		if data[i] < data[j]:
			dp[i] = max(dp[j] + 1, dp[i])

print(max(dp))