package Likelion;

//에라토스테네스의 체 - array (효율성 향상 시도)
//list에서 add, remove연산을 할 필요가 없어 시간 복잡도가 감소

/*
1. 2부터 50까지 숫자가 들어 있는 Array 만들기
2. 만든 Array 크기의 checks 배열을 만들기
3. 만든 Array 대신 checks 배열에 2를 제외한 모든 2의 배수에 false로 바꿈
4. 소수만 출력해보기 (checks에 true인 nums[i]만 출력)
 */

import java.util.Scanner;

public class Nov02arr {
    public void solution(int n) {
        int[] arr = new int[n-1];
        boolean[] checks = new boolean[n-1];

        for (int i = 0; i < n-1 ; i++) {
            arr[i] = i+2; //234567...50
        }

        for (int i = 0; i < n-1; i++) {
            if (i % 2 != 0) {
                checks[i] = true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s:%b, ", i,checks[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Nov02arr result = new Nov02arr();
        result.solution(x);
    }

}
