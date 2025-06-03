x = int(input())

pack3 = 0
pack5 = 0

while x - 3 >= 0 and x % 5 != 0 :
	x -= 3
	pack3 += 1

while x - 5 >= 0:
	x -= 5
	pack5 += 1

if x != 0:
	print(-1)
else:
	print(pack3 + pack5)