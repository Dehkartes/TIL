n, a, b, c, d = map(int, input().split())

x1 = n // a + (1 if n % a != 0 else 0)
x2 = n // c + (1 if n % c != 0 else 0)

print(min(x1 * b, x2 * d))