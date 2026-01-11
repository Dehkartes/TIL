mn = 999999999

for _ in range(int(input())):
	x = sum(map(int, input().split()))
	if mn > x:
		mn = x

print(mn)