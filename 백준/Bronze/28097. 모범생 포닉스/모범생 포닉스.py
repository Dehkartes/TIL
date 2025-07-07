input()

total = 0
for i in map(int, input().split()):
	total += i
	total += 8
total -= 8
print(total // 24, total % 24)