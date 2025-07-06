a1, a2, a3 = map(int, input().split())
b1, b2, b3 = map(int, input().split())
a = a1 + 2 * a2 + 3 * a3
b = b1 + 2 * b2 + 3 * b3

print(0 if a == b else 1 if a > b else 2)