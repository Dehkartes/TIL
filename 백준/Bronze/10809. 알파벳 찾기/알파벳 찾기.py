x = input()

res = {}
for i in range(ord('a'), ord('z') + 1):
	res[chr(i)] = -1

for i in range(len(x)):
	if res[x[i]] == -1:
		res[x[i]] = i

print(* list(res.values()))