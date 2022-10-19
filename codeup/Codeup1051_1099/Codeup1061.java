package codeup.Codeup1051_1099;

import java.util.Scanner;
//비트단위 연산 = 2진수 연산

public class Codeup1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String num3 = Integer.toBinaryString(a|b);

        int result = Integer.parseInt(num3,2);
        System.out.printf("%d", result);
    }
}
