x = int(input())
score = x * 10

if x >= 3:
	score += 20

if x >= 5 :
	score += 50

if int(input()) > 1000:
	score = max(score - 15, 0)

print(score)