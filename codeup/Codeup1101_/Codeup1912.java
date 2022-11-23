package codeup.Codeup1101_;

import java.util.Scanner;
//팩토리얼
public class Codeup1912 {
    public static int factorial(int n) {
        int a = n;
        if(n==1) return 1;
        else {
            a = n * factorial(n-1);
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Codeup1912 result = new Codeup1912();
        System.out.println(result.factorial(num));
    }
}

