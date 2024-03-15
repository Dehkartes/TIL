def solution(line):
	point = [] # 별 찍을 좌표
	answer = []
	
	# 모든 직선의 교점을 확인
	for i in range(0, len(line)):
		for j in range(i+1, len(line)):
			# Ax + By + E = 0, Cx + Dy + F = 0에서 두 직선의 교점이 유일하게 존재할 때
			# x = (BF - ED) / (AD - BC)
			# y = (EC - AF) / (AD - BC)
			div = line[i][0] * line[j][1] - line[i][1] * line[j][0] # AD - BC
			if div != 0:
				x = (line[i][1]*line[j][2] - line[i][2]*line[j][1]) / div # (BF - ED) / (AD - BC)
				y = (line[i][2]*line[j][0] - line[i][0]*line[j][2]) / div # (EC - AF) / (AD - BC)
				if float(x).is_integer() and float(y).is_integer():
					point.append([int(x), int(y)])

	# 좌표평면상 최대 x, y 좌표를 구함
	x1, x2 = min(point, key = lambda x: x[0])[0], max(point, key = lambda x: x[0])[0]
	y1, y2 = min(point, key = lambda x: x[1])[1], max(point, key = lambda x: x[1])[1]
	
	# 높이: y2 - y1, 너비: x2 - x1인 배열을 생성, 배열의 모든 좌표를 순회
	for y in range(y2 - y1 + 1):
		st = ""
		for x in range(x2 - x1 + 1):

			# 행렬 인덱스를 좌표로 변환한 값이 ex) 0 , 0 -> -4, -4
			# point에 있으면 순회중인 인덱스에 * 입력
			if [(x + x1), (y + y1)] in point:
				st += "*"
			else:
				st += "."
		answer.append(st)
	
	answer.reverse()
	return answer

print(solution([[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]]))