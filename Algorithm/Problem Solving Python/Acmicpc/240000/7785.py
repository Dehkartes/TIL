data = {}

for _ in range(int(input())):
	key, value = input().split()
	if value == "enter":
		data.setdefault(key)
	else:
		del data[key]

for i in sorted(list(data.keys()), reverse=True):
	print(i)