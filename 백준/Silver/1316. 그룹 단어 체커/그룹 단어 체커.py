def isGroupWorld(word):
	data = {}

	pre = ""
	for i in word:
		if pre != i:
			if data.get(i) != None:
				return False
			else:
				data[i] = True
		pre = i
	
	return True

result = 0

for i in range(int(input())):
	if isGroupWorld(input()):
		result += 1

print(result)