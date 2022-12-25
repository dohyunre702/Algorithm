n, m = map(int, input().split())

# 각 행의 최소값을 구한다
# 그 중에서 최대값을 출력한다

result = 0
for i in range(n):
    data = list(map(int, input().split()))
    min_value = min(data)
    result = max(result, min_value)
print(result)
