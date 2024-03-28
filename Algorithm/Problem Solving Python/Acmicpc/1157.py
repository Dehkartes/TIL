text = input().upper()

mx = 0
mxCount = 0
char = ''
for i in range(ord("A"), ord("Z") + 1):
	n = text.count(chr(i))
	if mx == n:
		mxCount += 1
	elif mx < n:
		mx = n
		mxCount = 1
		char = chr(i)

if mxCount > 1:
	print("?")
else:
	print(char)