package codeup.Codeup1101_;

import java.util.Scanner;

public class Codeup1859 {
    public void print(int n) {
        if(n == 0) return;
        else {
            print(n-1);
            System.out.print("*");
        }
    }
    public void next(int n) {
        if(n == 0) return;
        else {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Codeup1859 result = new Codeup1859();
        result.print(a);
    }
}
