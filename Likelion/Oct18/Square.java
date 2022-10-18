package Likelion.Oct18;

import java.util.Scanner;

public class Square {
    //repeat 메소드 사용 (모던 자바 스타일)
    public void printSquare (int a) {
        for (int i = 0; i < a; i++) {
                System.out.println("*".repeat(a));
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        //바로 넣어주기
        new Square().printSquare(num1);
        /*
        Square instance1 = new Square();
        instance1.printSquare(num1);
        */
    }
}
