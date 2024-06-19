croatia = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

x = input()

for i in croatia:
	x = x.replace(i, "*")

print(len(x))