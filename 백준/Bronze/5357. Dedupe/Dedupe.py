def fix_str(x: str):
	res = ""
	before = ""

	for i in x:
		if before != i:
			res += i
		before = i

	return res

for i in range(int(input())):
	print(fix_str(input()))