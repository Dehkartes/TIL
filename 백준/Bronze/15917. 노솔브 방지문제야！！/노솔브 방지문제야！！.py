import sys
input = sys.stdin.readline

for _ in range(int(input())):
	a = int(input())
	if (a & (-a)) == a:
		print(1)
	else:
		print(0)