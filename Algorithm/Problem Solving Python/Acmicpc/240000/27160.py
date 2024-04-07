def solution():
	card = {"STRAWBERRY": 0, "BANANA": 0, "LIME": 0, "PLUM": 0}

	for _ in range(int(input())):
		key, value = input().split()
		card[key] += int(value)

	for key, value in card.items():
		if value == 5:
			return "YES"
	return "NO"

print(solution())