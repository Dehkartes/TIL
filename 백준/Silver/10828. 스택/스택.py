import sys

input = sys.stdin.readline

stack = []

for _ in range(int(input())):
	userInput = input().split()
	match userInput[0]:
		case "push":
			stack.append(userInput[1])
		case "pop":
			try:
				print(stack.pop())
			except:
				print(-1)
		case "size":
			print(len(stack))
		case "empty":
			if len(stack) > 0:
				print(0)
			else:
				print(1)
		case "top":
			try:
				print(stack[-1])
			except:
				print(-1)