def solution(k, ranges):
	answer = []
	sequence = [k]

	# 수열 구하기
	while k > 1:
		if k % 2 == 0:
			k = k / 2
		else:
			k = k * 3 + 1
		sequence.append(k)

	# 범위에 따른 너비 구하기
	mx = len(sequence) - 1
	for x1, x2 in ranges:
		area = 0
		x2 = mx + x2
		if x1 > x2:
			answer.append(-1.0)
			continue

		for i in range(x1, x2):
			area += (sequence[i]+ sequence[i + 1]) / 2
		answer.append(area)
	
	return answer

print(solution(5, [[0,0], [0,-1],[2,-3],[3,-3]]))