import math

def decimalToBaseN(decimal, n):
    baseN = []
    while True:
        remainder = decimal % n
        decimal = decimal // n
        baseN.insert(0, str(remainder))
        if decimal == 0:
            break
    return baseN
        
def isPrimeNumber(n):
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def solution(n, k):
    count = 0
    text = "".join(decimalToBaseN(n, k)).split("0")
    for i in text:
        if i == "" or isPrimeNumber(int(i)) == False or i == "1":
            continue
        count += 1