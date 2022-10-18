package codeup.Codeup1000_1050;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexNum = sc.nextLine();
        int num = Integer.parseInt(hexNum, 16);

        System.out.printf("%o",num);
    }
}
