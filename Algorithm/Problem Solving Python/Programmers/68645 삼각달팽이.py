def solution(n):
	max = 0
	
	for i in range(1, n + 1):
		max = max + i
	
	answer = []

	move = 0
	mod = 0
	row = 0
	col = 0
	
	for i in range(1, n + 1):
		answer.append([0 for i in range(i)])

	for i in range(1, max + 1):
		answer[row][col] = i
		move += 1

		if move == n:
			move = 0
			n -= 1
			mod += 1

		if mod % 3 == 0:	
			row += 1
		elif mod % 3 == 1:
			col += 1
		elif mod % 3 == 2:
			row -= 1
			col -= 1
			
	result = []
	for i in answer:
		result.extend(i)

	return result

print(solution(5))