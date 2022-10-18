package codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        String[] seperateNum = number.split("\\.");

        System.out.printf(seperateNum[0]);
        System.out.println();
        System.out.printf(seperateNum[1]);

    }
}

/*
1. 구분자로 문자열 분리하기
public class Main {
	public static void main(String[] args) {
		String str = "jhnyang@tistory@com";
		String[] strAry = str.split("@");

		for (String s : strAry)
			System.out.println(s);
	}
}

2. 이스케이프 문자 : 온점은 메타문자. "\\."으로 파싱
 */