def solution(answers):  # [1,2,3,4,5]
    result = []
    array1 = [1, 2, 3, 4, 5]
    array2 = [2, 1, 2, 3, 2, 4, 2, 5]
    array3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    # 길이 맞춰주기 (몫만큼 곱해서 반복하고, 나머지 더해주기)
    a = array1 * (len(answers) // len(array1)) + array1[:(len(answers) % len(array1))]
    b = array2 * (len(answers) // len(array2)) + array2[:(len(answers) % len(array2))]
    c = array3 * (len(answers) // len(array3)) + array3[:(len(answers) % len(array3))]

    # 각 배열을 answers과 비교해서, 값이 같으면 count
    score = [0, 0, 0]
    for i in range(len(answers)):
        if a[i] == answers[i]:
            score[0] += 1
        if b[i] == answers[i]:
            score[1] += 1
        if c[i] == answers[i]:
            score[2] += 1
    # score = [5,0,0]
    # answers = [1,2,3,4,5]

    # (코드 참고) : 최대값 새로운 배열에 넣어 반환
    for k in range(len(score)):
        if max(score) == score[k]:
            result.append(k + 1)  # 수포자 이름 = 1,2,3이라 index + 1

    return result