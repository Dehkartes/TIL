y, m, d = map(int, input().split('-'))
n = int(input())

total = y * 360 + (m - 1) * 30 + (d - 1)
total += n

y = total // 360
total %= 360
m = total // 30 + 1
d = total % 30 + 1

print(f"{y:04d}-{m:02d}-{d:02d}")
