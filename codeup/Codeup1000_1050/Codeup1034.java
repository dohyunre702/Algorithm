package codeup.Codeup1000_1050;

import java.util.Scanner;

public class Codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octNum = sc.nextLine();
        int num = Integer.parseInt(octNum, 8);

        System.out.printf("%d",num);
    }
}

/*
1. integer.parseint, toString 사용
n진수 '문자열' 받아 > 10진수 정수로 변환 : Integer.parseInt(int i, int radix);
** radix : 변환하기 전 진법
왜 문자열인가? : int는 전부 10진수로 인식하므로 10진수를 제외한 나머지 진수는 문자열로 받아야 한다.
10진수 정수 > n진수 문자열 : toString(int n, int radix)
단,
2진수 : Integer.toBinaryString(a)
8진수 : Integer.toOctalString(a)
16진수 : Integer.toHexString(a)
사용 가능.

2. 해당 진법 숫자로 계속 나누어 몫, 나머지 출력

 */