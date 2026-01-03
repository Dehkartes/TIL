n, h, v = map(int, input().split())

height = max(h, n - h)
width = max(v, n - v)

print(height * width * 4) 