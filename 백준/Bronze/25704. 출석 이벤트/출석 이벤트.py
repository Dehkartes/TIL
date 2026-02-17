n = int(input())
p = int(input())

candidates = [p]

if n >= 5:
	candidates.append(max(p - 500, 0))

if n >= 10:
	candidates.append(int(p * 0.9))

if n >= 15:
	candidates.append(max(p - 2000, 0))

if n >= 20:
	candidates.append(int(p * 0.75))

print(min(candidates))