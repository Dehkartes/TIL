x = int(input())

a, b, c = map(int, input().split())

print(min(a, x) + min(b, x) + min(c, x))