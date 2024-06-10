'''

센서의 거리를 내림차순 정렬
집중국 - 1 인덱스 부터 거리 배열의 합 구하기
'''

n = int(input())
k = int(input())
sensor = sorted(list(map(int, input().split())))
gap = [sensor[i + 1] - sensor[i] for i in range(n - 1)]
print(sum(sorted(gap, reverse=True)[k - 1:]))