cnt = 0

for _ in range(9):
	cnt += 1 if input() == "Lion" else 0

print("Lion" if cnt > 4 else "Tiger")