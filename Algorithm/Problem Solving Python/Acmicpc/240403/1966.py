"""
31120kb 48ms

완전 탐색을 위해 리스트로 큐 구현, 리스트의 요소는 문서의 중요도
리스트의 0번 인덱스와 나머지 인덱스의 요소를 비교
0번 인덱스의 요소가 가장 중요도가 크다면 출력, 아니면 팝하고 리스트 마지막에 추가
"""

class PrintInfo:
	def __init__(self, priority: int, target: int, printer: list[int]) -> None:
		self.priority = priority
		self.target = target
		self.printer = printer

printInfoList: list[PrintInfo] = []
for _ in range(int(input())):
	priority, target = map(int, input().split())
	printInfoList.append(PrintInfo(priority, target, list(map(int, input().split()))))

for printinfo in printInfoList:
	count = 0
	while True:
		document = printinfo.printer.pop(0)
		printinfo.target -= 1
		isHighest = True
		for i in printinfo.printer:
			if document < i:
				printinfo.printer.append(document)
				if printinfo.target == -1:
					printinfo.target = len(printinfo.printer) - 1
				isHighest = False
				break
		if isHighest:
			count += 1
			if printinfo.target == -1:
				print(count)
				break