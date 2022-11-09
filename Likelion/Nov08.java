package Likelion;

import java.util.Scanner;


//codeup3001. 데이터 탐색
public class Nov08 {
    public int linearSearch(int[] arr, int a) {
        int number = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                number = i+1;
                break;
            } else {
                number = -1;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int k = sc.nextInt();

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Nov08 result = new Nov08();
        System.out.print(result.linearSearch(numbers, k));
    }
}
