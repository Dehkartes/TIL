"""
36244kb 1056ms

딕셔너리에 집어넣고 키가있으면 카운트++
"""

n, m = map(int, input().split())
dic = {}

for _ in range(n):
	dic[input()] = True

count = 0
for _ in range(m):
	if dic.get(input()) != None:
		count += 1

print(count)