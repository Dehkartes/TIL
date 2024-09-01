def D(n):
	res = 0
	for i in str(n):
		res += int(i)

	return n + res

mx = 0
cur = 1
seq = set([])

for i in range(1, 10001):
	seq.add(D(i))

for i in seq:
	for j in range(cur, i):
		if j > 10000:
			exit()
		print(j)
	cur = i + 1