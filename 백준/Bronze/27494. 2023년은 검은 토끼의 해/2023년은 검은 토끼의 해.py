result = 0

for i in range(int(input())+ 1):
	text = str(i)
	target = ['3', '2', '0', '2']
	for j in range(len(text)):
		if target and  text[j] == target[-1]:
			target.pop()
	if len(target) == 0:
		result += 1

print(result)