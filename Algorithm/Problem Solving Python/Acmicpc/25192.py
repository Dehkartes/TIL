# 124ms

import sys
from collections import defaultdict
input = sys.stdin.readline

data = defaultdict(int)
new = False
count = 0

for _ in range(int(input())):
	text = input().rstrip()
	if text == "ENTER":
		data.clear();
	elif data[text] == 0:
		count += 1
		data[text] += 1

print(count)