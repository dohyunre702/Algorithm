package Likelion.Oct17;

import java.util.Scanner;

public class Rhombus {
    public void printRhom(int n) {
        for (int i = 0; i < n; i++) {
            //j는 공백
            for (int j = n-1-i; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < (2*i)+1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = (n/2)+1; i >= 0; i--) {
            //j는 공백
            for (int j = (n/2)-i+2; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int k = (2*i); k >= 0; k--) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        Rhombus print = new Rhombus();
        print.printRhom(num1);
    }
}