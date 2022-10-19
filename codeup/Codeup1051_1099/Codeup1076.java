package codeup.Codeup1051_1099;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        //영문자 1개를 입력한다.
        //문자를 숫자로 형변환
        //for문 돌리기
        //해당 숫자를 문자로 형변환해서 표현

        Scanner sc = new Scanner(System.in);
        char n = sc.nextLine().charAt(0);
        int a = (int) n;

        for(int i = 97; i <= a; i++) {
            System.out.printf("%c ", i);
        }
    }
}
