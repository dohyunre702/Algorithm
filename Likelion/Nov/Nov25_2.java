package Likelion.Nov;

import java.util.Scanner;

//꼬리재귀 빼기
public class Nov25_2 {
    public static void recur(int n) {
        if (n<=0) return;
        recur(n-1);
        System.out.println(n);
        recur(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();


    }
}
