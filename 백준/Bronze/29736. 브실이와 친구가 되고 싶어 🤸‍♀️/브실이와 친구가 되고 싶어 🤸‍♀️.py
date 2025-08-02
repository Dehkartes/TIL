a, b = map(int, input().split())
k, x = map(int, input().split())

mn = max(a, k - x)
mx = min(b, k + x)

result = mx - mn + 1

print("IMPOSSIBLE" if result < 1 else result)