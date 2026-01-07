n, m = map(int, input().split())

x = n // m

if n % m != 0:
	x += 1

print(x)