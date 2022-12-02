package Likelion.Nov;

import java.util.Scanner;

//재귀 없는 피보나치 수열
public class Nov23 {
    public static int fibonacci(int n) {
        int a1 = 0;
        int a2 = 1;
        int sum = 0;

        if(n == 0) {
            return a1;
        } else if(n == 1) {
            return a2;
        } else {
            for(int i = 0; i < n; i++) {
                sum = a1 + a2;
                a1 = a2;
                a2 = sum;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Nov23 result = new Nov23();
        System.out.println(result.fibonacci(num));
    }

}
