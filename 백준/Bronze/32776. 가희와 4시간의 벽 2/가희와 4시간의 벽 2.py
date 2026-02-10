s_ab = int(input())
flight = sum(map(int, input().split()))

use_rail = False

if s_ab <= 240:
	use_rail = True
elif s_ab <= flight:
	use_rail = True

print("high speed rail" if use_rail else "flight")