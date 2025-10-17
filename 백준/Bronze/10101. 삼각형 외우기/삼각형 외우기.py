x = int(input())
y = int(input())
z = int(input())

if x + y + z == 180:
	if x == y == z:
		print("Equilateral")
	elif x == y or y == z or z == x:
		print("Isosceles")
	else:
		print("Scalene")
else:
	print("Error")