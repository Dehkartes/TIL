"""
31120kb 44ms

문자를 하나씩 읽어 '(' 일 때 스택 푸시 ')' 일 때 팝
팝 연산에서 스택이 비어 예외가 생기거나 루프가 끝났을 때 스택이 비어있지 않다면 VPS가 아님
"""

pStrList = []

for _ in range(int(input())):
	pStrList.append(input())

for pStr in pStrList:
	stack = []
	isVPS = True
	for char in pStr:
		match char:
			case "(":
				stack.append(char)
			case ")":
				try:
					stack.pop()
				except:
					isVPS = False
					break
	if len(stack) > 0:
		isVPS = False
	print("YES" if isVPS else "NO")