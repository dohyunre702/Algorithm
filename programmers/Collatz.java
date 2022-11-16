package programmers;

import java.util.Scanner;

//콜라츠 추측(collatz conjecture)
public class Collatz {
    public int solution(long num) {
        int answer = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            if (answer >= 500) {
                answer = -1;
                break;
            }
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

