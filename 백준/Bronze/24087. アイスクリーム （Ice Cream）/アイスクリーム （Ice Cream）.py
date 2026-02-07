s = int(input())
a = int(input())
b = int(input())

additional_len = max(0, s - a)

additional = additional_len // b + (0 if additional_len % b == 0 else 1)

print(250 + additional * 100)