list = ['l', 'k', 'p']

text = True
for _ in range(3):
	char = input()[0]
	if not char in list:
		text = False
	else:
		list.remove(char)
			  
print("GLOBAL" if text else "PONIX")
	