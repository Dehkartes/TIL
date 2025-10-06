t1, e1, f1 = map(int, input().split())

t2, e2, f2 = map(int, input().split())

time_max = 3 * t1 + 20 * e1 + 120 * f1
time_mel = 3 * t2 + 20 * e2 + 120 * f2

if time_max > time_mel:
	print("Max")
elif time_mel > time_max:
	print("Mel")
else:
	print("Draw")