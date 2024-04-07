# 31120kb	40ms

decoded = []
nextDecoded = []

incoded = input().split(":")

idx = 0
isNext = False
for i in incoded:
	if i != "" and not isNext:
		decoded.append(i)
	elif isNext == False and i == "":
		isNext = True
	elif i != "":
		nextDecoded.append(i)

for _ in range(8 - len(decoded) - len(nextDecoded)):
	decoded.append("0000")

decoded.extend(nextDecoded)

for i in range(len(decoded)):
	decoded[i] = (4 - len(decoded[i])) * '0' + decoded[i]

print(":".join(decoded))