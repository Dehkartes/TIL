def solution(genres, plays):
	answer = []
	data = []
	dic = {}

	# data: [(인덱스, 장르, 재생횟수)]
	for i, j in enumerate(zip(genres, plays)):
		data.append((j[0], j[1], i))

	# data를 재생횟수로 내림차순 정렬
	data.sort(key=lambda x: x[1], reverse=True)

	# 가장 많이 재생된 장르 판단을 위한 딕셔너리 생성
	# {장르: [재생횟수, 인덱스1, 인덱스2...]}
	for i in data:
		if dic.get(i[0]) == None:
			dic[i[0]] = [i[1], i[2]]
		else:
			dic[i[0]][0] += i[1]
			dic[i[0]].append(i[2])
	
	# 딕셔너리 항목 추출, 장르별 재생 횟수로 내림차순 정렬
	dic = sorted(dic.items(), key=lambda x: x[1][0], reverse=True) # x: (genere, [play, i1, i2....])

	# dic 읽어서 결과 반환
	for i in dic:
		count = 0
		for j in range(1, len(i[1])):
			answer.append(i[1][j])
			count += 1
			if count > 1:
				break

	return answer

print(solution(["classic", "pop", "classic", "classic", "pop"], [500, 600, 150, 800, 2500]))