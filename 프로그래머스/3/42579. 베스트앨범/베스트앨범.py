def solution(genres, plays):
	answer = []
	data = []
	dic = {}
	for i, j in enumerate(zip(genres, plays)):
		data.append((j[0], j[1], i))

	data.sort(key=lambda x: x[1], reverse=True)

	for i in data:
		if dic.get(i[0]) == None:
			dic[i[0]] = [i[1], i[2]]
		else:
			dic[i[0]][0] += i[1]
			dic[i[0]].append(i[2])
	
	dic = sorted(dic.items(), key=lambda x: x[1][0], reverse=True) # x: (genere, [play, i1, i2....])

	for i in dic:
		count = 0
		for j in range(1, len(i[1])):
			answer.append(i[1][j])
			count += 1
			if count > 1:
				break

	return answer