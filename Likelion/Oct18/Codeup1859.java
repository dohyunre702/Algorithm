package Likelion.Oct18;

import java.util.Scanner;

public class Codeup1859 {
    /* n = 4일 때,
    f(4) = f(3) + 1
         = f(2) + 1 + 1
         = f(1) + 1 + 1 + 1
    따라서,
    f(1) = f(4) - 3
    f(2) = f(4) - 2
    f(3) = f(4) - 1
    f(4) = print("*")
    */

    public void printRS(int a) {
        if (a == 0) {
            return;
        } else {
            System.out.println("*".repeat(a));
            printRS(a - 1);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        Codeup1859 recurStar = new Codeup1859();
        recurStar.printRS(num1);
    }
}
