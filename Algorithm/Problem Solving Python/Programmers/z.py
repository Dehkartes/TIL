def solution(numbers):
    answer = []
    for i in range(len(numbers) - 1):
        for j in range(i + 1, len(numbers)):
            if numbers[i] < numbers[j]:
                print(numbers[i], numbers[j])
                answer.append(numbers[j])
                break
        answer.append(-1)
    answer.append(-1)
        
    return answer

solution(	[2, 3, 3, 5])