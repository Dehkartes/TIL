from collections import defaultdict

seqF = defaultdict(int)

n = int(input())

seq = list(map(int, input().split()))

for i in seq:
	seqF[i] += 1

stack = []
idx = 0
result = [0 for _ in range(n)]

while idx < n:
	if not stack:
		stack.append(idx)
		idx += 1
	elif seqF[seq[stack[-1]]] < seqF[seq[idx]]:
		result[stack.pop()] = seq[idx]
	else:
		stack.append(idx)
		idx += 1

for i in stack:
	result[i] = -1

print(*result)