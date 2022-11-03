package Likelion.Oct.Oct18;

import java.util.Scanner;

public class Rectangle {
    public void printRec (int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Rectangle instance1 = new Rectangle();
        instance1.printRec(num1, num2);
    }
}
