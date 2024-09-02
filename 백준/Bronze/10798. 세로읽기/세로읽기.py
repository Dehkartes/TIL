seq = []
mxLen = 0
for _ in range(5):
	x = input()
	length = len(x)

	if mxLen < length:
		mxLen = length
	seq.append(x)

for k in range(5):
	if len(seq[k]) < mxLen:
			seq[k] = seq[k] + ' ' * (mxLen - len(seq[k]))

for i in range(mxLen):
	for j in range(5):
		x = seq[j][i]
		if x != ' ':
			print(x, end="")