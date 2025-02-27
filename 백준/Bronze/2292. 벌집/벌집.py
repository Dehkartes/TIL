x = int(input())
level = 0
now = 1
while x > now:
	level += 1
	now += level * 6
	

print(level + 1)