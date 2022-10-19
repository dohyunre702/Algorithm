package codeup.Codeup1051_1099;
//등차수열 문제

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //시작값
        int d = sc.nextInt(); //공차
        int n = sc.nextInt(); //몇 번째인지

        int result = a + d * (n-1);
        System.out.print(result);

    }

}
