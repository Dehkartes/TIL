m, d = map(int, input().split())
cnt = d // m
cnt += 1 if d % m else 0

print(cnt)