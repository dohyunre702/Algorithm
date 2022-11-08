package Likelion;

import java.util.Scanner;


//codeup3001. 데이터 탐색
//-1 출력. 왜??
public class Nov08 {
    public int linearSearch(int[] arr, int a) {
        int i = 0;

        while(true) {
            if (i == arr.length) {
                return -1;
            }
            if (arr[i] == a) {
                return arr[i];
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int k = sc.nextInt();

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("%d, ", numbers[i]);
        }

        Nov08 result = new Nov08();
        System.out.print(result.linearSearch(numbers, k));

    }
}
