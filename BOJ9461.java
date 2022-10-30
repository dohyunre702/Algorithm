import java.util.Scanner;

//파도반 수열 - 통과 불가. 왜?
public class BOJ9461 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] memo = new long[101];

        //2. for문으로 해결
        //if로 넣으면 i=1~5 값 할당이 안됨
        memo[1] = memo[2] = memo[3] = 1;
        memo[4] = memo[5] = 2;

        for (int i = 6; i <= 100; i++) {
            memo[i] = memo[i - 1] + memo[i - 5];
        }

        System.out.println(memo[n]);
        }
    }