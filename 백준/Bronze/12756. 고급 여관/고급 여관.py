aa, ad = map(int, input().split())
ba, bd = map(int, input().split())

a_health = (ad // ba) + (1 if ad % ba != 0 else 0)
b_health = (bd // aa) + (1 if bd % aa != 0 else 0)

if a_health > b_health:
	print("PLAYER A")
elif b_health > a_health:
	print("PLAYER B")
else:
	print("DRAW")
