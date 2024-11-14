def solution(a, b):
	x = b % 4
	x = 4 if b % 4 == 0 else x
	result = str(a ** (x))[-1]
	print(10 if result == '0' else result)

for i in range(int(input())):
	a, b = map(int, input().split())
	solution(a, b)