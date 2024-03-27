import sys
for i in range(int(input())):
	text = sys.stdin.readline().replace("\n", "").split(" ")
	for i in text[1]:
		print(i * int(text[0]), end="")
	print()