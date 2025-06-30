data = []
score = 0
for _ in range(8):
	data.append(input())

for row in data:
	for col in row:
		match col:
			case "P":
				score += 1
			case "N":
				score += 3
			case "B":
				score += 3
			case "R":
				score += 5
			case "Q":
				score += 9
			case "p":
				score -= 1
			case "n":
				score -= 3
			case "b":
				score -= 3
			case "r":
				score -= 5
			case "q":
				score -= 9

print(score)
