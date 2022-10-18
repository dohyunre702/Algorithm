package codeup;

import java.util.Scanner;
//코드업 통과 안됨.
public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeInput = sc.nextLine();
        String[] timeStr = timeInput.split(":");
        System.out.printf(timeStr[1]);

    }
}
