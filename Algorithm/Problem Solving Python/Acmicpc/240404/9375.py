"""
34008kb 80ms

옷 이름은 중요하지 않음 옷 종류와 개수만 딕셔너리에 저장
종류가 ABC가 있을 때 해당 종류를 안 입는경우를 고려해 각각 개수 +1
따라서 모든 경우의수는 (A개수+1) * (B개수+1) * (c개수+1)
모든 종류를 입지 않는 경우는 없으니 총 개수 -1
"""
from collections import defaultdict

for _ in range(int(input())):
	data = defaultdict(int)
	for i in range(int(input())):
		data[input().split()[1]] += 1
	
	result = 1
	for i in data.values():
		result = result * (i + 1)
	
	print(result - 1)