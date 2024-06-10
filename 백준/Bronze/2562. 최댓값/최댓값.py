mx = 0
p = 0

for i in range(1, 10):
	x = int(input())
	if mx < x:
		mx = x
		p = i

print(mx)
print(p)