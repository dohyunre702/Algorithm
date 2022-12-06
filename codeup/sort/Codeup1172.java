package codeup.sort;

import java.util.Scanner;

public class Codeup1172 {
    static void arraySort(int a, int b, int c) {
        int[] arr = {a, b, c};
        int tmp = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        arraySort(num1, num2, num3);
    }
}
