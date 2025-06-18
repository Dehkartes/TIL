text = input()
under_cnt = 0
colon_cnt = 0

for i in text:
	if i == "_":
		under_cnt += 1
	elif i == ":":
		colon_cnt += 1

print(len(text) + colon_cnt + under_cnt * 5)