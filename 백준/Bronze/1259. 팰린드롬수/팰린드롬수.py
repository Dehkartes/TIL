def isPalrindrom(number):
	number = str(number)
	for i in range(len(number) // 2):
		if number[i] != number[len(number) - i - 1]:
			return "no"
	return "yes"

while True:
	x = int(input())
	if x == 0:
		break
	print(isPalrindrom(x))