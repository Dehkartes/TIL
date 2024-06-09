input()

list = list(map(int, input().split()))
x = int(input())
result = 0
for i in list:
	if i == x:
		result += 1

print(result)