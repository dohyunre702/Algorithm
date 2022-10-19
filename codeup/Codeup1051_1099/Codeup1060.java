package codeup.Codeup1051_1099;

import java.util.Scanner;
//비트단위 연산 = 2진수 연산

public class Codeup1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //a,b 정수를 2진수 문자열로 반환 Integer.toBinary"String"()
        String num1 = Integer.toBinaryString(a);
        String num2 = Integer.toBinaryString(b);

        //()안에서 비트연산하기. 어떻게?
        String num3 = Integer.toBinaryString(a&b);

        //Integer.parseInt(String s, 현재 radix). 현재 radix를 10진법으로 변환
        //int result = Integer.parseInt(num3); 에러. 정확한 사용형식이 아님.
        int result = Integer.parseInt(num3,2);
        System.out.printf("%d", result);
    }
}
