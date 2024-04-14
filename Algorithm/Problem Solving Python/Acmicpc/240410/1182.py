'''
31120kb 1164ms
'''

from itertools import combinations

n, s = map(int, input().split()) # 정수 개수, 원소의 합
data = list(map(int, input().split()))

result = 0

for i in range(1, n+1, 1): # 원소가 1개부터 n개인 부분수열의 합을 모두 탐색
	for j in combinations(data, i):
		sm = 0 # SUM
		for k in j: # 선택된 부분수열의 합 구하기
			sm += k
		if sm == s:
			result += 1

print(result)