input()
table = {}
for i in input().split():
	table[i] = 1

input()
for i in input().split():
	if table.get(i) == 1:
		print(1)
	else:
		print(0)