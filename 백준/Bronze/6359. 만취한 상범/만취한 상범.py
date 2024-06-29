from sys import *

input = stdin.readline

def solution(k):
	arr = [0 for _ in range(k)]

	open = k

	for i in range(2, k + 1):
		for j in range(i, k + 1, i):
			if arr[j - 1] == 0:
				arr[j - 1] = 1
				open -= 1
			else:
				arr[j - 1] = 0
				open += 1
	
	return open

for _ in range(int(input())):
	print(solution(int(input())))