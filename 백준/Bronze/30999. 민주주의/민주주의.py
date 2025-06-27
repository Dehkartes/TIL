A, B = map(int, input().split())
res = 0
for _ in range(A):
	cnt = 0
	for j in input():
		if j == "O":
			cnt += 1
	
	if cnt > B // 2:
		res += 1

print(res)