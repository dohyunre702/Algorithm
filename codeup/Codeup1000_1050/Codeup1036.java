package codeup.Codeup1000_1050;

import java.util.Scanner;

public class Codeup1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character = sc.nextLine().charAt(0);
        System.out.println((int)character);
    }
}

/*
영문자 -> 10진수
1. String을 char형으로 바꾼다. (문자열.charAt(원하는 인덱스));
2. char을 int로 형변환한다.
 */