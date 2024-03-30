# 34028kb 68ms

import sys
from collections import defaultdict
input = sys.stdin.readline

data = defaultdict(int)
lastInput = ""
pre = ""
post = ""

for _ in range(int(input())):
	text = input().rstrip()
	data[text] = 1
	if text == "?":
		pre = lastInput
	elif lastInput == "?":
		post = text
	lastInput = text

for _ in range(int(input())):
	text = input().rstrip()
	if (pre == "" or text[0] == pre[-1]) and (post == "" or text[-1] == post[0]) and data[text] == 0:
		print(text)