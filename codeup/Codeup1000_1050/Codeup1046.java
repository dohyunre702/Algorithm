package codeup.Codeup1000_1050;

import java.util.Scanner;

class GetSumAvg {
    public void calculate(int a, int b, int c) {
        System.out.println(a + b + c);
        System.out.printf("%.1f", (float) (a + b + c) / 3);
    }
}

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        GetSumAvg result = new GetSumAvg();
        result.calculate(a,b,c);
        }
    }
