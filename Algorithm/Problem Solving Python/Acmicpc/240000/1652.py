# 31120kb 48ms
import sys
input = sys.stdin.readline

n = int(input())
count1 = 0
count2 = 0
data = []
for i in range(n):
	data.append(input())

for i in range(n):
	length = 0
	for j in range(n):
		if data[i][j] == ".":
			length += 1
		if j == n - 1 or data[i][j] == "X":
			if length > 1:
				count1 += 1
			length = 0

for i in range(n):
	length = 0
	for j in range(n):
		if data[j][i] == ".":
			length += 1
		if j == n - 1 or data[j][i] == "X":
			if length > 1:
				count2 += 1
			length = 0

print(count1, count2)