package codeup.Codeup1000_1050;

import java.util.Scanner;

class Calculate {
    public void calculate(int m, int n) {
        int plus = m + n;
        int minus = m - n;
        int multiple = m * n;
        int share = m / n;
        int remain = m % n;
        float k = (float)m/(float)n;

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f\n", plus, minus, multiple, share, remain, k);
    }
}
public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculate result = new Calculate();
        result.calculate(a,b);

    }
}
