package programmers;

import java.util.Scanner;

//콜라츠 추측(collatz conjecture)
public class Collatz {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        if (num == 1) answer = 0;
        else {
            int n = num;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    cnt++;
                } else if (n % 2 != 0) {
                    n = n * 3 + 1;
                    cnt++;
                }
            return cnt;
            }
            answer = cnt;
        }
        if (answer > 500) {
            answer = -1;
        }
        return answer;
    }

    //테스트용
    // case1. 입력 6, 기댓값 8
    // case2. 입력 16, 기댓값 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Collatz result = new Collatz();
        System.out.println(result.solution(x));
    }
}

