package codeup.Codeup1051_1099;

import java.util.Scanner;

public class Codeup1088 {

    public void threeMul(int a) {
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.printf("%d ",i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Codeup1088 result = new Codeup1088();
        result.threeMul(num);
    }

}
