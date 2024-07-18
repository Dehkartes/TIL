n, m = map(int, input().split())

mat1 = [[] for _ in range(n)]
mat2 = [[] for _ in range(n)]

for i in range(n):
	for j in map(int, input().split()):
		mat1[i].append(j)

for i in range(n):
	for j in map(int, input().split()):
		mat2[i].append(j)

mat3 = [[0 for _ in range(m)] for _ in range(n)]

for i in range(n):
	for j in range(m):
		mat3[i][j] = mat1[i][j] + mat2[i][j]

for i in range(n):
	print(*mat3[i])