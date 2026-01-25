res = 0

for _ in range(int(input())):
	x = input().lower()
	if "pink" in x or "rose" in x:
		res += 1

print(res if res else "I must watch Star Wars with my daughter")