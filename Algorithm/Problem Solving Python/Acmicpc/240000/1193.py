import time

start = time.time()
n = int(input())
mx = 1
level = 1
add = 2
while mx < n:
	level += 1
	mx += add
	add += 1 
	
row = 1
col = 1

if level % 2 == 1:
	col = level
	while mx > n:
		row += 1
		col -= 1
		mx -= 1

else:
	row = level
	while mx > n:
		row -= 1
		col += 1
		mx -= 1

print(f"{row}/{col}")
end = time.time()

print(end-start)