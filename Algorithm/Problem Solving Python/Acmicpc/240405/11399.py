'''
31120kb 40ms

오름차순 정렬 후 누적 합 연산
'''

input()
sum = 0
result = 0
for i in sorted(list(map(int, input().split()))):
	sum += i
	result += sum

print(result)