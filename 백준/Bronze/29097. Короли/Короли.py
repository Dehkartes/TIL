n, m, k, a, b, c = map(int, input().split())

arr = [n * a, m * b, k * c]
mx = max(arr)

res = []

for i, v in enumerate(arr):
	if v == mx:
		if i == 0:
			res.append("Joffrey")
		elif i == 1:
			res.append("Robb")
		elif i == 2:
			res.append("Stannis")

print(*sorted(res))
