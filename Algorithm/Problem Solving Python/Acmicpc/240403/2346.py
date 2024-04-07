"""
34028kb 104ms

덱을 사용
풍선 번호와 종이를 모두 저장하기 위해 튜플사용(풍선, 종이)
종이가 +면 팝, n - 1 번 왼쪽 팝 + 오른쪽 어펜드, 왼쪽에서 다음 루프 시작
종이가 -면 팝, -n - 1 번 오른 팝 + 왼쪽 어펜드, 오른쪽에서 다음 루프 시작
"""

from collections import deque

n = int(input())
balloonDequeue = list(map(int, input().split()))
for i in range(n):
	balloonDequeue[i] = (balloonDequeue[i], i + 1)

balloonDequeue = deque(balloonDequeue)

isPositive = True
while True:
	paper, balloon = balloonDequeue.popleft() if isPositive else balloonDequeue.pop()
	print(balloon, end= " ")
	if not balloonDequeue:
		break
	isPositive = False if paper < 0 else True
	if isPositive:
		for _ in range(paper - 1):
			balloonDequeue.append(balloonDequeue.popleft())
	else:
		for _ in range(-paper - 1):
			balloonDequeue.appendleft(balloonDequeue.pop())