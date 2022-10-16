from itertools import permutations


def solution(k, dungeons):
    answer = -1  # 이유?
    arr = list(permutations([i for i in dungeons], len(dungeons)))  # 모든 경우의 수 탐색

    for case in arr:
        hp = k  # k 초기화
        count = 0
        for mp in case:
            if hp >= mp[0]:
                hp = hp - mp[1]
                count = count + 1
        answer = max(answer, count)  # 최대값 갱신
    return answer