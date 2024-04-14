_, k = map(int, input().split())
num = input()
stack = []

for i in num:
	while stack and int(stack[-1]) < int(i) and k > 0:
		stack.pop()
		k -= 1

	stack.append(i)

for i in range(k):
	stack.pop()

print("".join(stack))