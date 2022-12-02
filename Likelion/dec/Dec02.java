package Likelion.dec;

import java.util.Scanner;

//소인수분해
public class Dec02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //소인수 찾기
        int num = sc.nextInt();

        for(int i=2; i<=num; i++) {
            while (num % i == 0) {
                num /= i;
                System.out.println(i+" ");
            }
        }
    }
}
