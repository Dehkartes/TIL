result = 0
for _ in range(int(input())):
	x = int(input().split('-')[1])
	if x <= 90:
		result +=1

print(result)