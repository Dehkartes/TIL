n, m, k = map(int, input().split())

o_count = min(m, k)
x_count = min(n-m, n-k)
print(o_count + x_count)