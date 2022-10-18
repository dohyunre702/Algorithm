package codeup;

import java.util.Scanner;

public class Codeup1054 {

    public void trueAndFalse (boolean n,boolean m) {
        System.out.printf("%b",n,m);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();

        Codeup1054 try1 = new Codeup1054();
        try1.trueAndFalse(a, b);
    }

}
