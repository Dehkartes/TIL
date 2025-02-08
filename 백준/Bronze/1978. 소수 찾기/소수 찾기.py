def is_prime_number(n):
	if n == 1:
		return False
	for i in range(2, int(n**0.5) + 1):
		if n % i == 0:
			return False
	return True

input()

sequence = list(map(int, input().split()))

result = 0
for i in sequence:
	if is_prime_number(i):
		result += 1

print(result)