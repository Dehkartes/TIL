x = input()

cnt = 0

for _ in range(int(input())):
	if x[0:5] == input()[0:5]:
		cnt += 1

print(cnt)