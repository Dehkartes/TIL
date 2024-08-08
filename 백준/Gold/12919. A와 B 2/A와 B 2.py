from collections import deque

queue = deque()

s = input()

queue.append(input())

while queue:
	t = queue.popleft()

	if len(t) > 0 and t[-1] == "A":
		x = t[:-1]
		if x == s:
			print(1)
			exit()
		queue.append(x)

	if len(t) > 0 and t[0] == "B":
		x = t[1:][::-1]
		if x == s:
			print(1)
			exit()
		queue.append(x)

print(0)