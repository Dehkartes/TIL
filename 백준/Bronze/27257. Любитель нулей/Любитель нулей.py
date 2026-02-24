k = (input())

for i in range(len(k) - 1, -1, -1):
	if k[i] == '0':
		k = k[:-1]
	else:
		break

res = 0

for i in k:
	if i == '0':
		res += 1

print(res)
