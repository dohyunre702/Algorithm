# 새로운 방식으로 접근
# 노란색 가로 = x, 노란색 세로 = y

# 전체 면적 = (x+2)(y+2)
# 노란색 = xy
# 갈색 면적 = 전체 면적 - 노란색 면적 = (x*2)+(y*2)+4

def solution(brown, yellow):
    answer = []
    x = 0  # 가로
    y = 0  # 세로
    for i in range(1, yellow + 1):
        if yellow % i == 0:  # i가 yellow로 곱해지면
            x = i
            y = yellow // i
            if x * 2 + y * 2 + 4 == brown:
                answer.append(x + 2)
                answer.append(y + 2)
                return sorted(answer, reverse=True)  # 내림차순 정렬

    return answer