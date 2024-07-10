import sys
input = sys.stdin.readline

def AC(command: str, size: int, intList: str):
	isReverse = False

	if size > 0:
		intList = intList[1 : -1].split(",")
	else:
		intList = []

	p1 = 0
	p2 = len(intList) - 1

	for char in command:
		if char == "R":
			isReverse = not isReverse
		else:
			if p2 - p1 + 1 < 1:
				return("error")
			elif isReverse:
				p2 -= 1
			else:
				p1 += 1
	
	if isReverse:
		intList = intList[p2 - len(intList) : p1 - len(intList) - 1 : -1]
	else:
		intList = intList[p1 : p2 + 1]

	return  "[" + ",".join(intList) + "]"

for _ in range(int(input())):
	print(AC(input().rstrip(), int(input()), input().rstrip()))