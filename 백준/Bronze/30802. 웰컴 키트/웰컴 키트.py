n = int(input())

orders = list(map(int, input().split()))

T, P = map(int, input().split())

a = 0
for i in orders:
	a += i // T
	if i % T != 0:
		a += 1

print(a)
print(n // P, n % P)