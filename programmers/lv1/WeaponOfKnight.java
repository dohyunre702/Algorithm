package programmers.lv1;
//기사단원의 무기
/*
1. 각 수의 약수의 개수부터 구한 다음 배열에 담는다.
2. for문 > 돌려서 limit과 비교
 1) 약수 개수 > limit : power 대입
 2) 약수 개수 <= limit : [i] 대입. answer++
*/
import java.util.Scanner;
public class WeaponOfKnight {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];

        for(int i = 1; i <= number; i++) {
            int tmp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    tmp++;
                }
                arr[i-1] = tmp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= limit) answer = answer + arr[i];
            else answer = answer + power;
        }
        return answer;
    }

    //test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lim = sc.nextInt();
        int pow = sc.nextInt();

        WeaponOfKnight result = new WeaponOfKnight();
        //solution(num, lim, pow);
        System.out.println(solution(num, lim, pow));
    }
}
