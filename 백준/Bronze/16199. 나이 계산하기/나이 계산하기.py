import datetime

y, m, d = map(int, input().split())
dy, dm, dd = map(int, input().split())

date = datetime.datetime(2000, m, d)
delta_date = datetime.datetime(2000, dm, dd)

if date <= delta_date:
	print(dy - y)
else:
	print(max(dy - y - 1, 0))

print(dy - y + 1)
print(dy - y)

