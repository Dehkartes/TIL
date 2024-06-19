x = input()
n = len(x)
res = 1
for i in range(n // 2):
	if x[i] != x[n -1 - i]:
		res = 0

print(res)