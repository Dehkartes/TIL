val, verdict = input().split()

mag = {
	"miss" : 0,
	"bad" : 200,
	"cool" : 400,
	"great" : 600,
	"perfect" : 1000
} [verdict]

print(int(val) * mag)