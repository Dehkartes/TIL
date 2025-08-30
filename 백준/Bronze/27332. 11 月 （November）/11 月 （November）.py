import datetime

today = datetime.date(2022, 11, int(input()))
x = today + datetime.timedelta(7 * int(input()))

if x.year == 2022 and x.month == 11:
	print(1)
else:
	print(0)