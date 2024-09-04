seq = []

for i in input():
	seq.append(int(i))

seq.sort(reverse = True)

for i in seq:
	print(i, end="")