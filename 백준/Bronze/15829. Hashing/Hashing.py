n = int(input())

result = 0
idx = 0
for i in input():
	x = ord(i) - ord("a") + 1
	result += x * (31 ** idx)
	idx += 1

print(result % 1234567891)