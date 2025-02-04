def rnd(num):
	if num - int(num) >= 0.5:
		return int(num) + 1
	else:
		return int(num)

n = int(input())

if n == 0:
	print(0)
	exit()

trimmed_mean = rnd(n * 30 / 100 / 2)

vote =  []
for i in range(n):
	vote.append(int(input()))

vote.sort()

print(rnd(sum(vote[trimmed_mean : (-trimmed_mean or None)]) / (n - trimmed_mean * 2)))
exit()