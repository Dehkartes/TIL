sm = 0

for i in range(int(input())):
	match input().split()[0]:
		case "136":
			sm += 1000
		case "142":
			sm += 5000
		case "148":
			sm += 10000
		case "154":
			sm += 50000

print(sm)
