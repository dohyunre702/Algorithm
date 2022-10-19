package codeup.Codeup1051_1099;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sum = 0;
        for (int i = 0; ; i++) {
            sum += i;
            if (sum >= input) {
                break;
            }
        }
        System.out.printf("%d",sum);
    }
}
