menu = []

for _ in range(int(input())):
	menu.append(int(input()))

result = 0

for _ in range(int(input())):
	result += menu[int(input()) - 1]

print(result)