package codeup.Codeup1101_;

import java.util.Scanner;

public class Codeup2623 {
    public int gcd(int a,int b) {
        if(a==b) return a;
        else if (a > b) {
            return gcd(a-b,b);
        }
        else if (a < b) {
            return gcd(a, b-a);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        int bb = sc.nextInt();
    }
}
