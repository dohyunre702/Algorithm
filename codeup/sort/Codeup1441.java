package codeup.sort;

import java.util.Scanner;

public class Codeup1441 {

    //버블정렬
    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = arr.length-1; j > i; j--)
                if(arr[j-1] > arr[j]) swap(arr, j-1, j);
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //swap 함수
    static void swap(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] exampleArr = new int[num];
        for (int i=0; i<exampleArr.length; i++) {
            exampleArr[i] = sc.nextInt();
        }
        bubbleSort(exampleArr);
    }
}
