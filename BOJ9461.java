import java.util.Scanner;

//파도반 수열
public class BOJ9461 {
    static long padoban(int x) {
        if (x <= 3 ) {
            return 1;
        } else if (x <= 5) {
            return 2;
        } else {
            return padoban(x - 2) + padoban(x - 3);
        }
    }
    //피보나치 수 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(padoban(n));
    }
}