x = sorted(list(map(int, input().split())))

for i in input():
	print(x[ord(i) - 65], end=" ")