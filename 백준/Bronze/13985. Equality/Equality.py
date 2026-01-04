x = list(map(int, input().replace(" ", "").replace("=", "+").split("+")))

if x[0] + x[1] == x[2]:
	print("YES")
else:
	print("NO")