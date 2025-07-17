input()
result = ""

for i in input():
	if i == "J":
		result += "O"
	elif i == "O":
		result += "I"
	elif i == "I":
		result += "J"

print(result)