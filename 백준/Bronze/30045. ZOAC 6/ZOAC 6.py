count = 0

for _ in range(int(input())):
	x = input()
	condition = False
	if "01" in x:
		condition = True
	if "OI" in x:
		condition = True
	if condition:
		count += 1

print(count)