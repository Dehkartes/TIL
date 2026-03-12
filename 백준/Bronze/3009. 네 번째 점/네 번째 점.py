from collections import defaultdict

x = defaultdict(int)
y = defaultdict(int)

for _ in range(3):
	xv, yv = input().split()

	x[xv] += 1
	y[yv] += 1
resx = ""
resy = ""
for x, y in zip(x.items(), y.items()):
	if x[1] == 1:
		resx = x[0]
	if y[1] == 1:
		resy = y[0]

print(resx, resy)