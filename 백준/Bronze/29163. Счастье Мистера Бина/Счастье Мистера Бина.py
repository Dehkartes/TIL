cnt_1 = 0
cnt_2 = 0
input()
for i in map(int, input().split()):
	if i % 2 == 0:
		cnt_2 += 1
	else:
		cnt_1 += 1

print("Sad" if cnt_1 >= cnt_2 else "Happy")