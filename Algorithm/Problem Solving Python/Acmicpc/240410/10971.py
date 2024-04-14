'''
622828kb 2300ms pypy

모든 도시를 순회하는 경우중 가장 비용이 적은 루트를 찾는 문제 (ex 10 -> 8 -> 9 -> 5 -> 7 -> 6 -> 4 -> 3 -> 2 -> 1)
모든 경우의 수를 구하고 가장 비용이 적은 경우를 구하기
최악의 경우 10! * 10 = 36,288,000이기때문에 브루트포스 가능(pypy만)

'''
from itertools import permutations
import sys
input = sys.stdin.readline

data = []
for _ in range(int(input())):
	data.append(list(map (int, input().split())))

result = None
dat = list(permutations([i for i in range(0, len(data))], len(data)))
for i in dat:
	sm = 0 # SUM
	isBreak = False
	for j in range(len(i)):
		if j != len(i) - 1:
			if data[i[j]][i[j+1]] == 0:
				isBreak = True
				break
			sm += data[i[j]][i[j + 1]]
		else: # 마지막인 경우
			if data[i[j]][i[0]] == 0:
				isBreak = True
				break
			sm += data[i[j]][i[0]]
	if (result == None or result > sm) and not isBreak: #저장된 비용보다 현재 비용이 더 작으면 현재 비용을 저장
		result = sm

print(result)