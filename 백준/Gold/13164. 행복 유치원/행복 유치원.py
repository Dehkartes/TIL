n, k = map(int, input().split())
result = []
data = list(map(int, input().split()))

for i in range(len(data) - 1, 0, -1):
	result.append(data[i] - data[i - 1])

print(sum(sorted(result, reverse=True)[k - 1::]))