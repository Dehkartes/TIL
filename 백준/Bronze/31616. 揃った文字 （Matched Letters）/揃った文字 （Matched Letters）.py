input()

x = ""

is_same = True

for i in input():
	if x == "":
		x = i
	else:
		if x != i:
			is_same = False

print("Yes" if is_same else "No")