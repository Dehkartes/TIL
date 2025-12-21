x = int(input())
rage = 0
today_rage = 0

for i in map(int, input().split()):
	if i:
		today_rage += 1

	else:
		today_rage -= 1

	rage += today_rage

print(rage)