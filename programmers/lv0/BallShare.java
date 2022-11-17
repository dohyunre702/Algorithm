package programmers.lv0;

import java.util.Scanner;

//구슬을 나누는 경우의 수
//접근 방식: 재귀(팩토리얼), 조합 공식
//정답률 42.9%
public class BallShare {
    public int factorial(int n) {
        int result = 0;
        if (n > 0) {
            result = n * factorial(n-1);
        }
        else {
            result = 1;
        }
        return result;
    }

    public int solution(int balls, int share) {
        int answer = factorial(balls) / (factorial(balls-share) * factorial(share));
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        BallShare bs = new BallShare();
        System.out.println(bs.solution(a, b));

    }
}
