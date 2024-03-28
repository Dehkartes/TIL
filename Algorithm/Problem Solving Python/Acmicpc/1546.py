mx = 0
result = 0

n = int(input())
scoreList = list(map(int, input().split()))
mx = max(scoreList)

for i in scoreList:
	result += i / mx * 100

print (result/n)