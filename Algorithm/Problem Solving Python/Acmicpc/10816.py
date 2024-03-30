# 888ms

from collections import defaultdict

data = defaultdict(int)
n = int(input())

for i in list(map(int, input().split())):
	data[i] += 1

n = int(input())
result = []
for i in list(map(int, input().split())):
	result.append(data[i])

print(*result)