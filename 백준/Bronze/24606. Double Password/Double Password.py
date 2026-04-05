ar1 = input()
ar2 = input()
res = 0

for a1, a2 in zip(ar1, ar2):
	if a1 != a2:
		res += 1

print(2 ** res)