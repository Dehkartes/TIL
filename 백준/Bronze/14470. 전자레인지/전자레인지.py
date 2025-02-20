a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())

total = 0
if a < 0:
	total = -a * c
	a = 0

if a == 0:
	total += d

if a >= 0:
	total += (b - a)*e

print(total)