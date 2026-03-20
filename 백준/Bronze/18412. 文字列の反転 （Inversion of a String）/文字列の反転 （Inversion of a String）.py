n, a, b = map(int, input().split())
s = input()

s1 = s[:a - 1]
s2 = s[a - 1:b]
s3 = s[b:]

print(s1 + ''.join(reversed(s2)) + s3)