def solution(fees, records):
	carList = []
	for i in records:
		carList.append(i.split(" "))
	carList = sorted(carList, key=lambda x : x[1])
	
	
	i = 0
	while True:
		newList = []
		if len(carList) > 1 and carList[i][1] == carList[i][1]:
			newList.append(fees)

	return carList