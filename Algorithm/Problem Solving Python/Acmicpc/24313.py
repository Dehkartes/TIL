# 31120kb	52ms
a1, a0 = map(int, input().split())
c = int(input())
n0 = int(input())

if -1 * (a1 - c) * n0 >= a0 and a1 <= c :
	print(1)
else:
	print(0)