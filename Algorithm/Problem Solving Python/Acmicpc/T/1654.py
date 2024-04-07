'''
31120kb 88ms
'''

import sys
input = sys.stdin.readline

k, n = map(int, input().split())

data = [int(input()) for _ in range(k)]

mn = 1
mx = max(data)

while mn <= mx:
	md = (mn + mx) // 2
	lanlen = 0

	for i in data:
		lanlen += i // md

	if lanlen >= n:
		mn = md + 1
	else:
		mx = md - 1

print(mx)