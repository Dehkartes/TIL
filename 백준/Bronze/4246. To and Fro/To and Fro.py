from sys import *
input = stdin.readline

def solution(n, text):
	isReverse = False
	message = []

	for i in range(len(text)// n):
		temp = []
		if isReverse:
			for j in text[i * n + n - 1 : i * n  - 1: -1]:
				temp.append(j)
			isReverse = False
		else:
			for j in text[i * n: i * n + n]:
				temp.append(j)
			isReverse = True
		message.append(temp)

	for i in range(n):
		for j in range(len(message)):
			stdout.write(message[j][i])

while True:
	n = int(input())
	if n == 0:
		break
	text = input()
	solution(n, text)
	stdout.write("\n")