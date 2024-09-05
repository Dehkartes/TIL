import math

A, B, V = map(int, input().split())
# if V == A:
# 	print(1)
# 	exit()
# if V - A < A - B:
# 	print(2)
# 	exit()
x = V - A
y = A - B
delta = math.ceil(x / y)
print(delta + 1)