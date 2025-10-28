dic = {
	"a": 4,
	"e": 3,
	"i": 1,
	"o": 0,
	"s": 5
}

for i in input():
	x = dic.get(i, i)
	print(x, end="")