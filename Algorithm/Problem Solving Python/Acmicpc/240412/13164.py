'''
66124kb 260ms

인접한 학생의 키차이를 구하기 -> K로 나눈다고 할 때, 키차이 배열에서 K-1개가 제외되며
이때 가장 비용이 큰 K-1개를 제외했을 때 키차이 배열의 합이 최소비용
'''

n, k = map(int, input().split())
result = []
data = list(map(int, input().split()))

for i in range(len(data) - 1, 0, -1):
	result.append(data[i] - data[i - 1])

print(sum(sorted(result, reverse=True)[k - 1::]))