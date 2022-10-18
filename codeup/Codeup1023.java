package codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        String[] seperateNum = number.split(".");

        System.out.println(seperateNum[0]);
        System.out.print(seperateNum[1]);

    }
}
