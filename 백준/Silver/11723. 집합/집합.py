import sys

input = lambda: sys.stdin.readline().rstrip()

data = set()

def add(x: int):
	data.add(x)

def remove(x: int):
	if x in data:
		data.remove(x)

def check(x: int):
	if x in data:
		print(1)
	else:
		print(0)

def toggle(x):
	if x in data:
		remove(x)
	else:
		add(x)

def all():
	for i in range(1, 21):
		add(i)

def empty():
	global data
	data = set()

for _ in range(int(input())):
	inputs = (input() + " 0").split()

	cmd = inputs[0]
	param = int(inputs[1])

	match cmd:
		case "add":
			add(param)
		case "remove":
			remove(param)
		case "check":
			check(param)
		case "toggle":
			toggle(param)
		case "all":
			all()
		case "empty":
			empty()

