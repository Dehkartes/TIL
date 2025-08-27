s, k, h = map(int, input().split()) 

if sum([s, k, h]) >= 100:
	print("OK")
elif min(s, k, h) == s:
	print("Soongsil")
elif min(s, k, h) == k:
	print("Korea")
else:
	print("Hanyang")