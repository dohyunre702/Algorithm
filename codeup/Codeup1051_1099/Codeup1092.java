package codeup.Codeup1051_1099;

import java.util.Scanner;
// while문으로 풀이
// 최소공배수로 구하는 법도 알아보기

public class Codeup1092 {
    public void calulate(int a, int b, int c){
        int x = 1;
        while(x%a != 0 || x%b != 0 || x%c != 0) {
            x++;
        }
        System.out.printf("%d",x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int periodA = sc.nextInt();
        int periodB = sc.nextInt();
        int periodC = sc.nextInt();

        Codeup1092 printPeriod = new Codeup1092();
        printPeriod.calulate(periodA,periodB,periodC);
    }


}
