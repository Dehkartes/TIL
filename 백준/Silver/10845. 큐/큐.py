import sys
from collections import deque

input = sys.stdin.readline

queue = deque()

for _ in range(int(input())):
	userInput = input().split()
	match userInput[0]:
		case "push":
			queue.append(userInput[1])
		case "pop":
			try:
				print(queue.popleft())
			except:
				print(-1)
		case "size":
			print(len(queue))
		case "empty":
			if len(queue) > 0:
				print(0)
			else:
				print(1)
		case "front":
			try:
				print(queue[0])
			except:
				print(-1)
		case "back":
			try:
				print(queue[-1])
			except:
				print(-1)