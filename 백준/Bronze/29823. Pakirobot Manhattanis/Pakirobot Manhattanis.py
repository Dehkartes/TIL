ns = []
we = []

input()

for i in input():
	if i == 'N' or i == 'S':
		if len(ns) == 0 or ns[-1] == i:
			ns.append(i)
		else:
			ns.pop()
	else:
		if len(we) == 0 or we[-1] == i:
			we.append(i)
		else:
			we.pop()

print(len(ns) + len(we))
			