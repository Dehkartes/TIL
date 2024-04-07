# 31120kb 44ms

n = int(input())
switch = list(map(int, input().split()))
studentCount = int(input())
student = []

for _ in range(studentCount):
	s, num = map(int, input().split())
	student.append((s, num))

for s, num in student:
	if s == 1:
		for i in range(len(switch)):
			if (i + 1) % num == 0 :
				match switch[i]:
					case 0:
						switch[i] = 1
					case 1:
						switch[i] = 0
	else:
		axis = num - 1
		change = [axis]
		for i in range(1, min(num - 1, n - num) + 1):
			if switch[axis - i] == switch[axis + i]:
				change.append(axis - i)
				change.append(axis + i)
			else:
				break
		for i in change:
			match switch[i]:
					case 0:
						switch[i] = 1
					case 1:
						switch[i] = 0

for i in range(1,n+1):
	print(switch[i-1], end = " ")
	if i % 20 == 0 :
		print()