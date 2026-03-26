l = int(input())
d = int(input())
x = int(input())

n = None
m = None


for i in range(l, d + 1):
	if sum(map(int, str(i))) == x:
		if not n:
			n = i
		m = i
print(n)
print(m)

