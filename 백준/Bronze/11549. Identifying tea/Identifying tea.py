x = int(input())
res = 0
for i in map(int, input().split()):
	if x == i:
		res += 1

print(res) 