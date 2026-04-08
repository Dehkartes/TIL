import sys
input = sys.stdin.readline

n = int(input())
res = sum(int(input()) - 1 for _ in range(n - 1))
print(res + int(input()))