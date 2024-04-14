'''
32140kb 84ms

1. 이분탐색, 최소는 0, 최대는 가장 예산이 큰 지방
2. 총액은 min(지방예산, 제한 예산)의 합
'''

n = int(input())
data = list(map(int, input().split()))
budget = int(input())

mn = 0
mx = max(data)

result = 0
while mn <= mx:
	md = (mn + mx) // 2

	total = 0
	for i in data:
		total += min(md, i)

	if total <= budget:
		mn = md + 1
		result = md
	else:
		mx = md - 1

print(result)