# 43924kb 108ms

import sys
from collections import defaultdict
input = sys.stdin.readline

n, m = map(int, input().split())
nSet = set()
mSet = set()

for _ in range(n):
	nSet.add(input().rstrip())

for _ in range(m):
	mSet.add(input().rstrip())

intersection = nSet & mSet
print(len(intersection))
for i in sorted(intersection):
	print(i)