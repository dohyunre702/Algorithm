package codeup.Codeup1051_1099;

import java.util.Scanner;
//1MB = 1024KB = 1024 * 1024 Byte = 1024 * 1024 * 8 bit.
//float. 정밀도 손실
//왜 안되지??? 왜 0.2?
public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong(); //가로 해상도
        long h = sc.nextLong(); //세로 해상도
        int b = sc.nextInt(); //비트

        double result = (w * h * b) / (1024 * 1024 * 8);
        System.out.printf("%.2f MB", result);
    }

}
