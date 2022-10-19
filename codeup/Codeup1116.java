package codeup;

import java.util.Scanner;
//long 형변환
public class Codeup1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d+%d=%d\n", a, b, a + b);
        System.out.printf("%d-%d=%d\n", a, b, a - b);
        System.out.printf("%d*%d=%d\n", a, b, a * b);
        System.out.printf("%d/%d=%d\n", a, b, (int)a / b);
    }
}
