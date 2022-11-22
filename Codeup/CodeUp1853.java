package codeup;

import java.util.Scanner;

//재귀로 1부터 n까지 합 리턴
public class CodeUp1853 {
    public static int sum(int n) {
        int numSum = 0;
        if(n<=1) return 1;
        else {
            return sum(n-1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        CodeUp1853 result = new CodeUp1853();
        System.out.println(result.sum(a));
    }
}
