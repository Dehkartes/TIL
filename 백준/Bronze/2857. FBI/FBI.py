agent = []

for i, text in enumerate([input() for _ in range(5)]):
	if "FBI" in text:
		agent.append(i + 1)

if agent:
	print(*agent)
else:
	print("HE GOT AWAY!")