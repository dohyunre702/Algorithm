package codeup;

import java.util.Scanner;

public class Codeup1111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%d%%", num);
    }
}

// "%d%", "%d\\%", 둘 다 UnknowFormatConversionException 발생.
// % = %%로 입력.