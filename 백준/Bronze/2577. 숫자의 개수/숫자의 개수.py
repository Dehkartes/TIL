res = {
	'0': 0,
	'1': 0,
	'2': 0,
	'3': 0,
	'4': 0,
	'5': 0,
	'6': 0,
	'7': 0,
	'8': 0,
	'9': 0,
}

A = int(input())
B = int(input())
C = int(input())

for i in str(A * B * C):
	res[i] += 1

for i in res.values():
	print(i)