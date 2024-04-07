'''
81352kb 272ms

집합 사칙 연산
'''

dicA = set()
dicB = set()

numA, numB = map(int, input().split())

for i in map(int, input().split()):
	dicA.add(i)

for i in map(int, input().split()):
	dicB.add(i)

print(len(dicA - dicB) + len(dicB - dicA))