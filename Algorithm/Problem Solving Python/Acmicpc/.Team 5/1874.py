stack = [0]
result = []

num = 1
isStack = True
for _ in range(int(input())):
	i = int(input())
	while num <= i:
		stack.append(num)
		result.append("+")
		num += 1

	if stack[-1] == i:
		stack.pop()
		result.append("-")

	else:
		isStack = False
		break

if isStack == False:
	print("NO")
else:
	for i in result:
		print(i)