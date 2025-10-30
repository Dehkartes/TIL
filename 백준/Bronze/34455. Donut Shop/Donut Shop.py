total = int(input())

for _ in range(int(input())):
	i = input()
	val = int(input())

	total = total + val if i == "+" else total - val
	
print(total)