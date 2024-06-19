def getScore(text):
	result = 0
	score = 0
	preScore = 0
	for i in text:
		if i == 'X':
			result += score
			score = 0
			preScore = 0
		else:
			score += preScore + 1
			preScore += 1
	result += score
	return result

for i in range(int(input())):
	print(getScore(input()))