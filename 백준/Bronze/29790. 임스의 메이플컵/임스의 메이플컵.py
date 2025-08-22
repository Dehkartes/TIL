x, y, z = map(int, input().split())

if x >= 1000:
	if y >= 8000 or z >= 260:
		print("Very Good")
	else:
		print("Good")
else:
	print("Bad")