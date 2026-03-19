for i in range(int(input())):
	print(f"Scenario #{i + 1}:")
	arr = sorted(map(int, input().split()))

	if arr[0] ** 2 + arr[1] ** 2 == arr[2] ** 2 and arr[2] < arr[0] + arr[1]:
		print("yes")
	else:
		print("no")
	print("")