x = int(input())

y = sum([i for i in range(1, x + 1)])

print(y)
print(y**2)
print(sum([i ** 3 for i in range(1, x + 1)]))