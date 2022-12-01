package programmers.lv1;
//기사단원의 무기
/*
1. number의 제곱근으로 약수를 구하는 메서드 1개 만들기
2. for문으로 1부터 num까지 약수의 개수를 더하기
**와우 성능 차이가 엄청 나긴 하는구나 1번 문제만 해도 약 40배이다(127ms -> 3.42ms)
*/

public class WeaponOfKnight {
    public int solution(int number, int limit, int power) {
    int answer = 0;
    for (int i = 1; i <= number; i++) {
        if (count(i) > limit) answer += power;
        else answer += count(i);
        }
    return answer;
    }

    public int count(int number) {
        int cnt = 0;
        //약수의 개수. 제곱근으로 구한 뒤 제곱수+1, 나머지 +2(순서쌍)
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                if (number / i == i) cnt++;
                else cnt += 2;
            }
        }
        return cnt;
    }
}
