'''
42204kb 484ms

최소: 블루레이 크기 중 가장 작은 값 -> 강의의 최대(블루레이에 모든 강의를 적어도 한 개 담을 수 있어야함)
최대: 강의 길이의 합
이진탐색노잼
'''
n, m = map(int, input().split()) # 강의 개수, 블루레이 개수
data = list(map(int, input().split())) # 강의 배열

mn = max(data)
mx = sum(data)
result = 0

while mn <= mx:
	md = (mn + mx) // 2

	total = 0
	count = 1

	for i in data:
		if total + i > md:
			count += 1
			total = 0
		total += i

	if count <= m:
		result = md
		mx = md - 1
	else:
		mn = md + 1

print(result)