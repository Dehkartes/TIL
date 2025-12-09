n = int(input())
arr = list(map(int, input().split()))
sorted_arr = sorted(arr)
res = 0

for i in range(n):
	if arr[i] != sorted_arr[i]:
		res += 1

print(res)