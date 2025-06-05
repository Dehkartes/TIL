data = []
rank_data = []

for _ in range(int(input())):
	data.append(tuple(map(int, input().split())))

for w, h in data:
	rank = 0
	for jw, jh in data:
		if jw > w and jh > h:
			rank += 1
	
	rank_data.append(rank + 1)

print(*rank_data)
