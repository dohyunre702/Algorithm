package codeup.Codeup1051_1099;

import java.util.Scanner;

//등비수열
public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //시작값
        int r = sc.nextInt(); //등비
        int n = sc.nextInt(); //몇 번째인지

        //codeup 테스트 케이스 때문에 int 대신 long으로 형변환
        long result = (long) (a * Math.pow(r, (n-1)));
        System.out.print(result);
    }
}

/*
자바에서 숫자 제곱하기 : Math.pow(밑, 지수)
ex. Math.pow(3,2) : 3의 2제곱
입출력 모두 실수형인 double
 */