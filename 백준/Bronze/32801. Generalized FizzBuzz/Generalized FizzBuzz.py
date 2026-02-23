n, a, b = map(int, input().split())

arr = [0, 0, 0]  # Fizz, Buzz, FizzBuzz

for i in range(1, n + 1):
	if i % a == 0 and i % b == 0:
		arr[2] += 1
	elif i % a == 0:
		arr[0] += 1
	elif i % b == 0:
		arr[1] += 1

print(*arr)