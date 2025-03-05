x = list(map(int, input().split()))
y = list(map(int, input().split()))

a = 0
b = 0

i = 0

for xv, yv in zip(x, y):
	match i:
		case 0:
			a += xv * 6
			b += yv * 6
		case 1:
			a += xv * 3
			b += yv * 3
		case 2:
			a += xv * 2
			b += yv * 2
		case 3:
			a += xv 
			b += yv
		case 4:
			a += xv * 2
			b += yv * 2
	i += 1

print(a, b)