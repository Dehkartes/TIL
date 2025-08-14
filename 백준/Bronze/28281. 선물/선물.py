n, x = map(int,input().split())

data = list(map(int,input().split()))

before = data[1]
mn = data[0] * x + data[1] * x
for i in data[2:]:
	k = before * x + i * x
	mn = min(mn, k)
	before = i

print(mn)