package codeup;

import java.util.Scanner;

public class Codeup1109 {
//생성자 사용 가능할 것 같은데.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        char code = sc.next().charAt(0);
        float key = sc.nextFloat();

        System.out.printf("%s\n", name);
        System.out.printf("%d\n", age);
        System.out.printf("%c\n", code);
        System.out.printf("%.3f\n", key);

    }
}
