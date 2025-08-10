cnt = int(input()) - 1
mx = mn =first = int(input())

for _ in range(cnt):
	x = int(input())
	if x > mx:
		mx = x
	elif x < mn:
		mn = x

if first == mn:
	print("ez")
elif first == mx:
	print("hard")
else:
	print("?")