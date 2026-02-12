h1, m1 = map(int, input().split(":"))
h2, m2 = map(int, input().split(":"))

if h1 < h2:
	print("YES")
elif h1 > h2:
	print("NO")
elif m1 < m2:
	print("YES")
else:
	print("NO")