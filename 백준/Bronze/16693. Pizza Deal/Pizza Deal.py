import math


A1, P1 = map(int, input().split())
R1, P2 = map(int, input().split())

x = A1 / P1
y = R1**2*math.pi / P2

print("Slice of pizza" if x > y else "Whole pizza")