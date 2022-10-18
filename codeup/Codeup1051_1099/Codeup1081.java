package codeup.Codeup1051_1099;

import java.util.Scanner;

public class Codeup1081 {

    public void combination (int a, int b){
        for (int i = 1; i<=a; i++) {
            for (int j = 1; j<=b; j++) {
                System.out.printf("%d %d", i, j);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Codeup1081 inputObj = new Codeup1081();
        inputObj.combination(n,m);

    }
}
