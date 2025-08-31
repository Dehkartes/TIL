a1, a2 = map(int, input().split())
c = int(input()) * 2
sm = a1 + a2

if sm >= c:
	print(sm - c)

else:
	print(sm)