# N, M, K를 공백으로 구분하여 입력받기
n, m, k = map(int, input().split())

# N개의 수를 공백으로 구분하여 입력받기
data = list(map(int, input().split()))

# 오름차순 정렬하기
data.sort()
sum = 0
cnt1 = 0 # 더한 횟수
cnt2 = 0 # 연속된 수

# 더한 횟수 = m이 될 때까지 반복
while cnt1 < m:
## 맨 뒤의 값 k번 더하기
    sum += data[-1]
    cnt1 += 1
    cnt2 += 1
## cnt2 = 연속된 값일 때 뒤에서 2번째 값 1번 더하기
    if cnt2 == k:
        sum += data[-2]
        cnt1 += 1
        cnt2 = 0
    else: continue

print(sum)