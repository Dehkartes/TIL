for _ in range(int(input())):
	res = 0
	a, b, c = map(int, input().split())
	res = min(c // 2, b) * 2
	res = res + min(c - res, a)

	print("YES" if res == c else "NO")