x = "%02d"% ( int(input()))
z = x
cnt = 0
while True:
	y = str(sum(map(int, z)))
	z = z[-1] + y[-1]
	cnt += 1
	if x == z:
		break
print(cnt)