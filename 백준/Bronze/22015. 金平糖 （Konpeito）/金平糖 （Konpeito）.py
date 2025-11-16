a, b, c = map(int, input().split())
x = max(a, b, c)
print(sum([x - a, x - b, x - c]))