score_cho = list(map(int, input().split()))
score_han = list(map(int, input().split()))
mag = [13, 7, 5, 3, 3, 2]

cho = 0
han = 0
for x, y, z in zip(score_cho, score_han, mag):
	cho += x * z
	han += y * z

print("cocjr0208" if cho > han + 1.5 else "ekwoo")