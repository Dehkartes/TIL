import datetime

h, m, s = map(int, input().split())
t = datetime.datetime(2001, 1, 1, hour=h, minute=m, second=s) + datetime.timedelta(seconds=int(input()))
print(t.hour, t.minute, t.second)
