x = {}
mx = 0
for _ in range(7):
	semina, populate = input().split()
	populate = int(populate)
	x[populate] = semina
	if populate >= mx:
		mx = populate

print(x[mx])