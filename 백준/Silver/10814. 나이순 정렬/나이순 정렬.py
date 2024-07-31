import sys

input = sys.stdin.readline

userList = []

for _ in range(int(input())):
	age, name = input().split()
	userList.append((int(age), name))

userList.sort(key=lambda x: x[0])

for a, b in userList:
	print(a, b)