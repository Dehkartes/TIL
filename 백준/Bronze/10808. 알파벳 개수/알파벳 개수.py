data = [0 for _ in range(26)]

for i in input():
	data[ord(i)-97] += 1

for i in data:
	print(i, end=" ")