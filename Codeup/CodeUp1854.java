package codeup;

import java.util.Scanner;

public class CodeUp1854 {
    public static long sum(long n) {
        int orderSum = 0;
        if(n % 10 == 0) {
            orderSum = (int)(n%10);
        }
        else {
            orderSum += n%10 + sum(n/10);
        }
        return orderSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        CodeUp1854 result = new CodeUp1854();
        System.out.println(result.sum(a));
    }
}
