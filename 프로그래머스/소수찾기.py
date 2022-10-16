from itertools import permutations


# 소수 판별 함수
def prime_num(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def solution(numbers):
    answer = 0
    listchar = []
    result1 = []
    # 순열이 담긴 리스트 만들기
    for i in range(1, len(numbers) + 1):
        tmp = list(permutations(numbers, i))
        # [["0"],["1"],["1"]],[["0","1"],["0","1"],["1","1"]],[["0","1","1"]]
        listchar += [int(''.join(i)) for i in tmp]  # 원소 하나로 합치기
        result1 = list(set(listchar))  # set 활용해서 중복제거 [0,1,11]

    # 리스트 카운트 (체)
    for i in result1:
        if prime_num(i):
            answer += 1
        else:
            continue

    return answer