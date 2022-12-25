# 기초문법 복습
## 정수
print (1, -7, 0)

## 실수
print (157.93, -123.2, 5. , .7)
if round(0.91111) == 0.9: print(True)

## 연산
a = 10; b = 5
print(a/b) # 나누기
print(a//b) # 몫
print(a%b) # 나머지
print(a**b) # 거듭제곱

## 자료형
## 1. 리스트
a = [1,2,3,4,5,6,7,8,9,10]
print(a)
print(a[4]) # 5
a = list() # 빈 리스트 선언 1
print(a)

### 크기 n이고 모든 값이 0인 1차원 리스트 초기화
n = 10
a = [0] * n
print(a)

### 인덱스 슬라이싱
a = [1,2,3,4,5,6,7,8,9,10]
print(a[1:4]) #2번째 원소에서 4번째 원소까지
### 리스트 컴프리핸션 1)
array = [i for i in range(20) if i % 2 == 1]
print(array)
### 리스트 컴프리핸션 2)
array2 = [i * i for i in range(1,10)]
print(array)

### 2차원 리스트 초기화
n = 3
m = 4
array = [[0] * m for _ in range(n)]
print(array)

### 리스트 메서드
b = [1,4,3]
b.append(2)
b.sort()
b.sort(reverse = True) # 내림차순
b.reverse() # 원소 뒤집기
b.insert(2,3) # 인덱스 2에 데이터 3 추가
b.count(3) # 3인 데이터 개수 세기
b.remove(1) # 값이 1인 데이터 삭제


###