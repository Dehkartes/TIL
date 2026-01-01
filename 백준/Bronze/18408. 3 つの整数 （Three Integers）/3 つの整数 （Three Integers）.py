cnt_1 = 0

for i in list(map(int, input().split())):
	if i == 1:
		cnt_1 += 1

if cnt_1 > 1:
	print(1)

else:
	print(2)
