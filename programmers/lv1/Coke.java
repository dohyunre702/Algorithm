package programmers.lv1;

import java.util.Scanner;

//콜라 문제
//a 콜라를 받기 위해 마트에 주어야 하는 병 수
//b 빈 병 a개를 가져다 주면 마트가 주는 콜라의 병 수
//c 상빈이가 가지고 있는 빈 병의 개수 n

public class Coke {
    public int tmpvalue(int a, int b, int n) {
        int cnt = 0;
        if (a/n != 1) {
            int tmp = (a%n) + (a/n);
            return tmp;
        } else return 1;
    }

    public int solution(int a, int b, int n) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Coke coke = new Coke();
        System.out.println(); //팩토리얼 출력
    }
}
