package programmers;

import java.util.Scanner;

//하샤드 수
class Hashad {

    static int hashad(int x) {
        int sum = 0;
        int tmp = x;

        while (tmp > 0) {
            int a = x % 10;
            tmp = x / 10;

            sum += a;
        }
        return sum;
    }

    //테스트 코드
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Hashad.hashad(n));
    }
}