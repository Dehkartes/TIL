_ = int(input())

x = sum(map(int, input().split()))
if x > 0:
	print("Right")
elif x == 0:
	print("Stay")
else:
	print("Left")
