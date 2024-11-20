# mCn

def solution():
	n, m = map(int, input().split())
	x = m
	res = 1
	for i in range(n):
		res *= x
		x -= 1
	
	for i in range(1, n + 1):
		res //= i

	return(int(res))

for i in range(int(input())):
	print(solution())