coodrs = []
for _ in range(int(input())):
	coodrs.append(list(map(int, input().split())))

coodrs.sort(key=lambda x: (x[0], x[1]))

for i in coodrs:
	print(*i)
