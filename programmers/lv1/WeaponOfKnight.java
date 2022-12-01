package programmers.lv1;
//기사단원의 무기
/*
약수 개수를 구하는 방법
1. 1부터 n까지, 각 숫자의 약수 개수를 배열에 담는다.
2. for문 > 돌려서 limit과 비교
1. 약수 개수 > limit : power 대입
2. 약수 개수 <= limit : [i] 대입
answer++
*/
import java.util.Scanner;
public class WeaponOfKnight {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        int[] temp = new int[number];

        for (int i = 0; i < number ; i++) {
            arr[i] = i+1; //[1,2,3,..,number]
        }

        for (int i = 0; i < number ; i++) {
            int a = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) a++;
            }
            temp[i] = a;
        }

        for (int i = 0; i < arr.length; i++) {
            if (temp[i] <= limit) answer = answer + temp[i];
            else answer = answer + power;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lim = sc.nextInt();
        int pow = sc.nextInt();

        WeaponOfKnight result = new WeaponOfKnight();
        System.out.println(solution(num, lim, pow));
    }
}
