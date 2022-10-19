package codeup.Codeup1051_1099;

import java.util.Scanner;

public class Codeup1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a != b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

// printf(“%d”, (a&&!b)||(!a&&b));
// 이런 식으로 하고싶은데ㅠ
/* boolean으로 ^(XOR) 연산이 가능하긴 하다. 입력값이 true/false여야 하지만..
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();

        if (a ^ b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
*/