from collections import defaultdict

n = int(input())

dic = defaultdict(list)

x = set()
maxlen = 0
for i in range(n):
	text = input().strip()
	if len(text) > maxlen:
		maxlen = len(text)
	x.add(text)

for i in x:
	dic[len(i) - 1].append(i)



for i in range(maxlen):
	for j in sorted(dic.get(i) or []):
		print(j)