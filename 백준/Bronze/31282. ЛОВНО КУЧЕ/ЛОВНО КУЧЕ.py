n, m, k = map(int, input().split())
d = k - m
print((n + d - 1) // d)