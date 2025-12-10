dic = {'B': 0, 'S': 0, 'A': 0}

x = int(input())

for i in input():
	dic[i] += 1

mx = -1
for i in dic.values():
	if i > mx:
		mx = i

res = ""

for k, v in dic.items():
	if v == mx:
		res += k

if res == "BSA":
	res = "SCU"

print(res)