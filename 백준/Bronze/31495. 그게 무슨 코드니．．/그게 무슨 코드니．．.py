text = input()

if text[0] == '"' and text[-1] == '"' and len(text.replace('"', "")) != 0:
	print(text[1:-1])
else:
	print("CE")