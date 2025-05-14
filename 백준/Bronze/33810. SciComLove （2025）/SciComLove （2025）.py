x = "SciComLove"

cnt = 0
for i, item in enumerate(input()):
	if item != x[i]:
		cnt += 1

print(cnt)
