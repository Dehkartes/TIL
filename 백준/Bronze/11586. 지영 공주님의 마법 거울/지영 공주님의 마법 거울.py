n = int(input())

arr = []
for _ in range(n):
	arr.append(input())

match input():
	case '1':
		for text in arr:
			print(text)
	
	case '2':
		for text in arr:
			print(''.join(reversed(text)))
	
	case '3':
		for text in reversed(arr):
			print(text)