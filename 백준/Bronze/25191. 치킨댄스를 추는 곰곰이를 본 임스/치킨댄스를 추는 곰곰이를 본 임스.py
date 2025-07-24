x = int(input())

y, z = map(int, input().split())

print(min((y // 2 + z), x))