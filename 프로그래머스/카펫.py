from itertools import combinations_with_replacement

# 구현이 되지 않음..

# 접근방식 : 약수 개수 구하기
def solution(brown, yellow):  # 10, 2
    prime = brown + yellow
    primearr = []
    for i in range(1, prime + 1):
        if (prime % i == 0):
            primearr.append(i)

    arr = list(combinations_with_replacement(primearr, 2))  # 중복조합으로 2개 뽑기

    for i in range(len(arr)):  # 각 조합의 원소 추출
        # print(arr[i]) #왜 튜플로 인쇄되는거지?
        x = arr[i][0]
        y = arr[i][1]

        if x < y:  # 가로가 세로보다 작으면 해당 리스트 제거
            del arr[i]
        if x * y != prime:  # x,y의 곱이 prime이 아니면 제거
            del arr[i]
        if (x - 2) * (y - 2) != yellow:
            del arr[i]
        if (2 * x) + (2 * y) - 4 != brown:
            del arr[i]
        if x <= 2 or y <= 2:
            del arr[i]

    return arr
    # IndexError: list index out of range > arr 길이가 바뀌어서 나는 오류같음