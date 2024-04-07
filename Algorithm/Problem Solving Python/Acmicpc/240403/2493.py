"""
시간초과 54214 반례
단방향 비교 -> 스택 사용
스택을 두 개 사용
1. 1번 스택에 값 순서대로 저장
2. 1번 스택 팝, 2번스택 푸시
3. 1번스택 탑과 2번스택 탑 비교
4. 1번스택이 더 크거나 같으면 1번스택 인덱스 반환, 2번스택 탑 팝, 아니면 2. 부터 다시 실행
5. 1번 스택이 비었는데 2번스택에 요소가 있다면 해당 요소는 수신받는 탑이 없음
"""
from collections import deque

stack1 = deque()
stack2 = deque()
answer = deque()
n = int(input())
stack1 = deque(list(map(int, input().split())))

while stack1:
	stack2.append(stack1.pop())
	if len(stack1) < 1:
		break
	for _ in range(len(stack2)):
		if stack1[-1] >= stack2[-1]:
			answer.append(len(stack1))
			stack2.pop()

for i in stack2:
	print(0, end=" ")

for i in range(len(answer)):
	print(answer.pop(), end=" ")

"""
99304kb 584ms
"""

n = int(input())
heights = list(map(int, input().split()))

stack = []  # 레이저 신호를 수신하는 탑들의 인덱스를 저장하는 스택
result = [0] * n

for i in range(n):
    while stack and heights[stack[-1]] <= heights[i]:
        stack.pop()  # 현재 탑보다 낮은 탑들을 스택에서 제거
    if stack:
        result[i] = stack[-1] + 1  # 현재 탑의 레이저를 수신하는 탑의 인덱스 저장
    stack.append(i)  # 현재 탑의 인덱스를 스택에 추가

print(*result)	