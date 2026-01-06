input()

data = list(map(int, input().split()))

result = 1

before = data[0]
for i in data[1:]:
	if before >= i:
		result = 0
	before = i

print(result)