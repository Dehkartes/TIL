table = {
	'j' : 2,
	'o' : 1,
	'i' : 2
}

input()
res = 0

for c in input():
	res += table[c]

print(res)