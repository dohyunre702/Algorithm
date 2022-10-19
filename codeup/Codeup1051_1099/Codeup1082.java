package codeup.Codeup1051_1099;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character = sc.nextLine().charAt(0);

        int num = (int)character;
        int hexDan = Integer.parseInt(String.valueOf(num), 16);
        int hexMax = Integer.parseInt("f",16);

        for (int i=1; i<=hexMax;i++) {
            System.out.printf("%x*%x=%x",hexDan,i,hexDan*i);
            System.out.println();
        }
    }

}
