text = input().split("-")

arr = []
for i in text:
	arr.append(sum(map(int, i.split("+"))))

res = arr[0]
for i in range(1, len(arr)):
	res = res - arr[i]

print(res)