package codeup.Codeup1101_;

import java.util.Scanner;

public class Codeup1855 {
    public static int fibonacci(int n) {
        if(n<=2) return 1;
        return fibonacci(n-2) + fibonacci(n-1);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Codeup1855 result = new Codeup1855();
        System.out.println(result.fibonacci(num));
    }
}