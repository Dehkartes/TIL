def solution(storey):
	answer = 0
	
	arr = []
	
	for i in str(storey):
		arr.append(int(i))
	
	for i in range(len(arr) - 1, 0, -1):
		if arr[i] == 5 and arr[i - 1] >= 5:
			answer += 10 - arr[i]
			arr[i - 1] += 1
		elif arr[i] < 6:
			answer += arr[i]
		else:
			answer += 10 - arr[i]
			arr[i - 1] += 1

	if arr[0] < 6:
		answer += arr[0]
	elif arr[0] < 10:
		answer += 10 - arr[0] + 1
	else:
		answer += 1
		
	return answer

print(solution(75))