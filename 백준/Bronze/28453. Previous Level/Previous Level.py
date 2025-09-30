input()
for x in map(int, input().split()):
	if x < 250:
		print(4, end=" ")
	elif x < 275:
		print(3, end=" ")
	elif x < 300:
		print(2, end=" ")
	else:
		print(1, end=" ")