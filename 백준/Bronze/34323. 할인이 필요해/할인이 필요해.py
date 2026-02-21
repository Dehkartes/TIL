n, m, s = map(int, input().split())

print(min(m * s, (m + 1) * s * (100 - n) // 100))