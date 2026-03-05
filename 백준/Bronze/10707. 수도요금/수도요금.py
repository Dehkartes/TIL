a = int(input())
b = int(input())
c = int(input())
d = int(input())
p = int(input())

z = 0
if p <= c:
    z = b
else:
    z = b + ((p - c) * d)

print(min(a * p, z))