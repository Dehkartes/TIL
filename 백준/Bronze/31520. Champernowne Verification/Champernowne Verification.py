point = 0
next = 1
next_point = 0
text = input()

while point < len(text):
	if text[point] == str(next)[next_point]:
		point += 1
		if next_point < len(str(next)) - 1:
			next_point += 1
		else:
			next += 1
			next_point = 0

	else:
		print(-1)
		exit()

print(next - 1)
