# 34028kb 76ms

from collections import defaultdict

def solution():
	data = defaultdict(int)
	text = input()
	for i in text:
		data[i] += 1

	odd = 0
	oddChar =  ""
	for key, value in data.items():
		if value % 2 == 1:
			oddChar = key
			data[key] -= 1
			odd += 1
	
	if odd > 1:
		return "I'm Sorry Hansoo"
	
	result = ""
	data = sorted(data.items())

	for key, value in data:
		result += key * (value//2)
	
	if odd == 1:
		result += oddChar
		return result + result[-2::-1]
	return result + result[-1::-1]

print(solution())