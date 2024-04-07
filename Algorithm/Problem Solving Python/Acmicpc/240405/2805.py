'''
257916kb 484ms

나무를 자르는 최소길이 ~ 최대 길이를 이진 탐색, 
최악의 경우 나무개수 * 나무길이 = 1,000,000 * (log, base 2 of 1,000,000,000 = 29.8) = 약 3억(nlogn)
절단기의 높이가 x일 때 가져가는 나무의 합이 m이라면 최대 높이가 x
'''

n, m = map(int, input().split())
data = list(map(int, input().split()))

mn = 0
mx = max(data)

while mn <= mx:
	mid = (mn + mx) // 2

	total = 0
	for i in data:
		if i > mid:
			total += i - mid
	
	if total < m:
		mx = mid - 1
	else:
		mn = mid + 1

print(mx)