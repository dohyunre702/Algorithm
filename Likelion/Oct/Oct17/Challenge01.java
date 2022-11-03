package Likelion.Oct.Oct17;

import java.util.Scanner;

//#, @ 등 어떤 letter를 출력할지
// Constructor를 통해 초기화하도록 리팩토링
// Constructor 오버로딩
public class Challenge01 {
    private String letter = "*";

    public Challenge01() {}; //기본생성자

    public Challenge01(String letter) {
        this.letter = letter;
    }

    public void printstar(String n) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.printf(n);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Challenge01 challenge = new Challenge01(str);
        challenge.printstar(str);
    }



}
