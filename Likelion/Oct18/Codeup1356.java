package Likelion.Oct18;

import java.util.Scanner;
//for문에도 순서가 있다.
//저걸 2차원 배열처리하는 게 더 빨리 먹히지 않을까... 값만 인덱싱해주면 될 거 같은데!
public class Codeup1356 {
    public void printRec(int a) {
        try {
            for (int i = 0; i < a; i++) { //1~5줄 for문
                if (i == 0 || i == a-1) { //각 라인 안에서 0번째, i번째
                    System.out.println("*".repeat(a));
                } else {
                    for (int k = 0; k == 0; k--) { //라인 안 0번째
                        System.out.print("*");
                    }
                    for (int j = 1; j < a-1; j++) { //라인 안 1 ~ a-1번째
                        System.out.print(" ");
                    }
                    for (int l = a-1; l == a-1; l++) { //라인 안 마지막
                        System.out.print("*");
                    }System.out.println();
                    }
                }
            } catch (Exception e) {
            if (a <= 2) {
                System.out.println("다시 입력해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();

        Codeup1356 print = new Codeup1356();
        print.printRec(num1);

    }
}
