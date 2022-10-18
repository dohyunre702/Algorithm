package codeup.Codeup1000_1050;

import java.util.Scanner;
//너무 코드가 단순한 거 같은데?
public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int a = number/10000;
        int b = (number/1000)%10;
        int c = (number/100)%10;
        int d = (number/10)%10;
        int e = number%10;

        System.out.printf("[%d]\n",a*10000);
        System.out.printf("[%d]\n",b*1000);
        System.out.printf("[%d]\n",c*100);
        System.out.printf("[%d]\n",d*10);
        System.out.printf("[%d]\n",e);
    }
}
