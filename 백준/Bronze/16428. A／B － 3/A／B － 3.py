A, B = map(int, input().split())

q = A // B
r = A % B

if r < 0:
	q += 1
	r -= B

print(q)
print(r)