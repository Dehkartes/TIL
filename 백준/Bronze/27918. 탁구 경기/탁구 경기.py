x = 0
y = 0
for _ in range(int(input())):
	if input() == 'D':
		x += 1
	else:
		y += 1
	
	if max(x, y) - min(x, y) > 1:
		break

print(f"{x}:{y}")