import datetime
n = input().split(" ")
day = datetime.date(2007, int(n[0]), int(n[1])).weekday()
print(["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"][day])