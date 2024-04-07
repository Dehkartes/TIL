import sys
input = sys.stdin.readline
data = {}

for _ in range(int(input().rstrip())):
	key = input().rstrip().split(".")[1]
	
	if data.get(key) == None:
		data[key] = 1
	else:
		data[key] += 1

for key, value in sorted(data.items()):
	print(key, value)