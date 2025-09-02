import math

S, D, I, L, N = map(int, input().split())

print(max(0, math.ceil((N - (S + D + I + L) / 4) * 4)))
