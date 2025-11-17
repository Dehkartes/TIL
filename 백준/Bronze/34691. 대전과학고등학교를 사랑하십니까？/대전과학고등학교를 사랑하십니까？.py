data = {
	"animal" : "Panthera tigris",
	"tree" : "Pinus densiflora",
	"flower" : "Forsythia koreana"
}

while True:
	x = input()
	if x == "end":
		break
	else:
		print(data[x])