n = int(input())
s = input()
t = input()
res = 0

for i in range(n):
	if s[i] != t[i]:
		res += 1

print(res)