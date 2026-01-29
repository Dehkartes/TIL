p, q = map(int, input().split())
a, b = map(int, input().split())

res = 0

if q > p:
	res = p * a
	res += (q - p) * b
else:
	res = q * a

print(res)