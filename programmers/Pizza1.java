package programmers;
//lv.0 피자나눠먹기
public class Pizza1 {
//피자를 나눠먹을 사람의 수 n이 주어질 때,
// 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수

    public int solution(int n) {
        int answer =  (n % 7 == 0) ? (n/7) : (n/7+1);

        return answer;
        }
    }

//가능하다면 삼항연산자 사용이 빠르다.