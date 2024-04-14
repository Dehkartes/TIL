n = int(input())
data = list(map(int, input().split()))

p1 = 0
p2 = n - 1
result = None
while p1 < p2:
	x = data[p1] + data[p2]

	if result is None or abs(data[result[0]] + data[result[1]]) > abs(x):
		result = (p1, p2)

	if x > 0 :
		p2 -= 1
	elif x < 0:
		p1 += 1
	else:
		break

print(data[result[0]], data[result[1]])