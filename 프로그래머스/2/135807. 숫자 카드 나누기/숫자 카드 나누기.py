# arrayA의 최대 공약수 x를 구한다
# arrayB의 모든 요소를 x로 나눌 수 있는지 검사한다
# 나눌 수 있는 요소가 있으면 0 아니면 x
def gcd(vec):
	a = vec[0]
	for i in range(1, len(vec)):
		b = vec[i]
		while b!= 0:
			[a, b] = [b, a % b]
	return a

def solution(arrayA, arrayB):
	x = gcd(arrayA)
	y = gcd(arrayB)

	for i in arrayB:
		if i % x == 0:
			x = 0
			break
	
	for i in arrayA:
		if i % y == 0:
			y = 0
			break
			
	return max(x, y)