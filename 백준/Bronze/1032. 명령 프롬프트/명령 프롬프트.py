texts = [input() for _ in range(int(input()))]

result = list(texts[0])

for text in texts[1:]:
	for i in range(len(text)):
		if text[i] != result[i]:
			result[i] = '?'

print("".join(result))