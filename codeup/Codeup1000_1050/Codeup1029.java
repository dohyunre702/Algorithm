package codeup.Codeup1000_1050;

import java.util.Scanner;

public class Codeup1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        System.out.printf("%.11f",num);
    }
}

/*
자바에서 소수점 반올림하는 3가지 방법
1. (double)Math.round(a); > 속도가 압도적으로 빠르다.
2. String.format("%.2f",a);
3. NumberFormat
 */
