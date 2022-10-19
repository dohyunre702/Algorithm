package codeup.Codeup1051_1099;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //시작값
        int m = sc.nextInt(); //곱할값
        int d = sc.nextInt(); //더할값
        int n = sc.nextInt(); //몇 번째인지


        int result = (int) ((a * Math.pow(m, n - 1)) + (d * (Math.pow(m, n) - 1) / (m - 1)));
        System.out.print(result);

    }
}