def solution(data, col, row_begin, row_end):
	data.sort(key=lambda x: (x[col - 1], -x[0]))
	Si = []
	for i in range(row_begin - 1, row_end):
		Si.append(sum([j % (i + 1) for j in data[i]]))
	result = Si[0]
	for i in range(1, len(Si)):
		result = result ^ Si[i]

	return result