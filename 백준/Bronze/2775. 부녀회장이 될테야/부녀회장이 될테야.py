def	solution(k, n):
	floor = [i for i in range(1, n + 1)]
	for i in range(k):
		for j in range(1, n):
			floor[j] += floor[j - 1]

	print(floor[-1])

for _ in range(int(input())):
	k = int(input())
	n = int(input())
	solution(k, n)