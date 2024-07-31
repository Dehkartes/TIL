# 수열을 리스트에저장
# 현재 인덱스: x
# 스택이 비었으면 x 푸시
# 스택[탑] < 리스트[x] 인 경우 y = 스택 팝, 정답 리스트[y] = 리스트[x]
# else 스택에 푸시
# 스택에 수열의 인덱스를 푸시

n = int(input())

seq = list(map(int, input().split()))
stack = []
idx = 0
result = [0 for _ in range(n)]
while idx < n:
	if not stack:
		stack.append(idx)
		idx += 1
	elif seq[stack[-1]] < seq[idx]:
		result[stack.pop()] = seq[idx]
	else:
		stack.append(idx)
		idx += 1
for i in stack:
	result[i] = -1

print(*result)