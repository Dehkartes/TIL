vec = []

for _ in range(9):
	vec.append(list(map(int, input().split())))

mx = -1
row = -1
col = -1

for i in range(9):
	for j in range(9):
		if vec[i][j] > mx:
			mx = vec[i][j]
			row = i
			col = j

print(mx)
print(row + 1, col + 1)