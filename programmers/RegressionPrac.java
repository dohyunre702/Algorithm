package programmers;

import java.util.Scanner;

//콜라 문제 풀기 위해 재귀 연습
public class RegressionPrac {

    //1.팩토리얼
    public int factorial(int n) {
        if (n > 0) {
            return n * factorial(n-1);
        }
        else return 1;
    }

    //2.두 정수의 최대공약수
    //최대공약수: a를 b로 나누었을 때, 나누어 떨어지는 가장 작은 값(단, a>b)
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        RegressionPrac result = new RegressionPrac();
        System.out.println(result.factorial(x)); //팩토리얼 출력
        System.out.println(result.gcd(num1, num2));
    }
}
