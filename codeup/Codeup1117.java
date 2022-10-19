package codeup;

import java.util.Scanner;
//실수형 출력 (소수 2째)

public class Codeup1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.printf("%.2f", a * b);
    }
}

