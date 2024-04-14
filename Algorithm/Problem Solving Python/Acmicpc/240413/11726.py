'''
31252kb 44ms

nk = nk-1 + nk-2
'''

p1 = 0
p2 = 1
result = 0

for _ in range(int(input()) + 1):
	p1 = p2
	p2 = result
	result = p1 + p2

print(result % 10007)