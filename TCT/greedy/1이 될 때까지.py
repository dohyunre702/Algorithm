n, k = map(int, input().split())

# n이 짝수일 때, n / k
# n이 홀수일 때, n-1

result = 0

# n >= k라면 k로 계속 나누기
while n >= k:
    if n % k == 0:
        n = n // k
        result += 1
    else:
        n = n - 1
        result += 1

# 마지막으로 남은 수에 대해 1씩 빼기
while n > 1:
    n -= 1
    result += 1

print(result)