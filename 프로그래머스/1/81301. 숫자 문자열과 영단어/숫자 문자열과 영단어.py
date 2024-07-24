table = {
		"zero": "0",
		"one": "1",
		"two": '2',
		"three": "3",
		"four": "4",
		"five": "5",
		"six": "6",
		"seven": "7",
		"eight": "8",
		"nine": "9"
		}

def solution(s):
	answer = ""

	buffer = ""
	for i in s:
		if ord("a") <= ord(i) <= ord("z"):
			buffer = buffer + i
			if table.get(buffer) != None:
				answer = answer + table[buffer]
				buffer = ""
		else:
			answer = answer + i
	
	return int(answer)