import java.util.Scanner;

//x는 몇 번째 피보나치 수? (시간초과로 인한 메모이제이션 활용)
//피보나치 수 2
public class BOJ2748 {
    static long[] memo; //전역 배열 선언
    static long fibonnaci(int x) {
        if (x <= 1 ) {
            memo[x] = x;
            return x;
        } else if (memo[x] != 0) {
            return memo[x];
        } else {
            return memo[x] = fibonnaci(x - 1) + fibonnaci(x - 2);
        }
    }
    //피보나치 수 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new long[n + 1]; //배열크기 정하기

        System.out.println(fibonnaci(n));
    }
}
