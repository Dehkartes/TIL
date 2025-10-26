x = int(input())

if -32768 <= x <= 32767:
	print("short")
elif -2147483648 <= x <= 2147483647:
	print("int")
else:
	print("long long")