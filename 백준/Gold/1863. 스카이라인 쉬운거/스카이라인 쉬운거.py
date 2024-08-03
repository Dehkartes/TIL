'''
높이가 다른 건물을 세면 최소
'''
import sys
input = sys.stdin.readline

data = []
for i in range(int(input())):
	data.append(int(input().split()[1]))
data.append(0)

stack = [0]

result = 0
for i in data:
	height = i	
	
	while stack[-1] > i: # 높이가 낮아지면 건물n개의 스카이라인 종료
		if stack[-1] != height: # 스택에 있는 건물과 높이가 같은경우(== i ) 제외
			result += 1
			height = stack[-1]
		stack.pop()
	stack.append(i)

print(result)