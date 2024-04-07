'''
31120kb 40ms

이진탐색으로 승률이 변하는 값의 최소를 탐색
'''
x, y = map(int, input().split())

rate = (y * 100) // x

mn = 0
mx = x
res = mx
if 99 <= rate:
	print(-1)
else:
	while mn <= mx:
		md = (mn + mx) // 2
		if ((y + md) * 100) // (x + md) > rate:
			res = md
			mx = md -1
		else:
			mn = md + 1
	print(res)