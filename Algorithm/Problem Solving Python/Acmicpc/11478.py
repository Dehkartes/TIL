text = input()
data = []
l = len(text)

for i in range(l): # i 선택할길이
	for j in range(l - i):	   # j 문자열의 시작점
		data.append(text[i: i + j + 1])

print(len(set(data)))