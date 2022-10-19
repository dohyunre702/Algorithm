package codeup;

import java.util.Scanner;
// 삼각형의 넓이
// 자동 형변환 int > float 자동변환 시 정밀도 손실
public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%.1f", (float) a * b / 2);
    }
}
