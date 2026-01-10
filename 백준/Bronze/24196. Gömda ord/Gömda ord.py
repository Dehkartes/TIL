x = input()
result = x[0]
p = ord(x[0]) - ord('A') + 1

while len(x) - 1 >= p:
	result += x[p]
	p += ord(x[p]) - ord('A') + 1

print(result)