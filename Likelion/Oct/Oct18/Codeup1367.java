package Likelion.Oct.Oct18;
// Parallelogram
/*
idea : if a = 4
1번째 줄    **** j=3, k=3부터 시작해서 * 4개 출력 > j=0~n-1,   k의 위치 = (n-1) ~ ((n-1)+n) k의 길이 : (n-1)+n-(n-1) = 2n
2번쨰 줄   ****  j=2, k=2부터 시작해서 * 4개 출력 > j=0~n-2,   k의 위치 = (n-2) ~ ((n-2)+n)
3번째 줄  ****   j=1, k=1부터 시작해서 * 4개 출력 > j=0~n-3,   k의 위치 = (n-3) ~ ((n-3)+n)
4번째 줄 ****    j=0, k=0부터 시작해서 * 4개 출력 > j=0~n-4,   k의 위치 = (n-4) ~ ((n-4)+n)
 */

import java.util.Scanner;

public class Codeup1367 {
    public void printparal(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = a-i-2; j >= 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = a-1; k < (a*2)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        Codeup1367 print = new Codeup1367();
        print.printparal(num1);

    }
}
