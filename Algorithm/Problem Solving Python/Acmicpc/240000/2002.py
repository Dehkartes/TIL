# 31120kb 40ms

import sys
input = sys.stdin.readline

n = int(input())

inList = []
outList = []

for _ in range(n):
	inList.append(input().rsplit())

for _ in range(n):
	outList.append(input().rsplit())

count = 0
j = 0

for i in outList:
	if i == inList[j]:
		j += 1
	else:
		inList.remove(i)
		count += 1

print(count)