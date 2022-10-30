import java.util.Scanner;

//x는 몇 번째 피보나치 수?

public class BOJ2747 {
    static int fibonnaci(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        return fibonnaci(x-1) + fibonnaci(x-2);
    }
    //피보나치 수 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonnaci(n));
    }
}
