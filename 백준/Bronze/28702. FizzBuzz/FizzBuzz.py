num = 0
numidx = 0 # 0 1 2

for i in range(3):
	x = input()
	
	if ord('0') <= ord(x[0]) <= ord('9'):
		numidx = i
		num = int(x)
		break

k = num + 3 - numidx

if k % 15 == 0:
	print("FizzBuzz")
elif k % 3 == 0:
	print("Fizz")
elif k % 5 == 0:
	print("Buzz")
else:
	print(k)