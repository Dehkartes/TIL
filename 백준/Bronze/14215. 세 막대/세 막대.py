arr = sorted(list(map(int, input().split())))

arr[2] = min((arr[0] + arr[1] - 1), arr[2])

print(sum(arr))