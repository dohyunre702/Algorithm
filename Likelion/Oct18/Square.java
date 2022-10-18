package Likelion.Oct18;

import java.util.Scanner;

public class Square {
    public void printsquare (int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        Square instance1 = new Square();
        instance1.printsquare(num1);
    }
}
