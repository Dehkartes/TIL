cnt = 0

input()
for word in input().split():
	if word in ["he", "him", "she", "her"]:
		cnt += 1

print(cnt)