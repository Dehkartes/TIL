import math

A, B, V = map(int, input().split())
x = V - A
y = A - B
delta = math.ceil(x / y)
print(delta + 1)