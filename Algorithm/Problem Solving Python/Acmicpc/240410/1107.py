'''
31120kb 2896ms
'''

import sys
input = sys.stdin.readline
n = int(input())
input()
data = list(map(int, input().split()))

# 현재 채널에서 + 혹은 -만 사용하여 이동하는 경우
mn = abs(100 - n)

for nums in range(1000001):
	nums = str(nums)
	
	for j in range(len(nums)):
		# 버튼이 고장났으면 루프종료
		if int(nums[j]) in data:
			break

		# 마지막까지 검사했다면
		elif j == len(nums) - 1:
			mn = min(mn, abs(int(nums) - n) + len(nums) ) # int(num) - 1 -> +나 -를 누르는 횟수, len(nums) 숫자 버튼을 누르는 횟수

print(mn)