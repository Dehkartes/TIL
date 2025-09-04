h, y = map(int, input().split())
hi, yi = map(int, input().split())

a = h + hi
b = y + yi

if a > b:
	print("Yongdap")
elif a < b:
	print("Hanyang Univ.")
else:
	print("Either")