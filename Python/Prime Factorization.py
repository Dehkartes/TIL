def isprime(n):
    i = 2
    while i**2 <= n:
        if n % 2 == 0:
            return False
        i += 1
    return True
def solution(n):
    answer = []
    while n != 1:
        for i in range(2, n+1):
            if isprime(i) and n % i == 0 :
                n = n // i
                answer.append(i)
                break
    return answer

print(solution(12))