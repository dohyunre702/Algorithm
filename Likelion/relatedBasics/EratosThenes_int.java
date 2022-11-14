package Likelion.relatedBasics;

public class EratosThenes_int {
    //1. int형 배열 사용
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N + 1];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        arr[0] = arr[1] = 0;
        for(int i = 2; i * i < arr.length; i++) {
            if(arr[i] != 0) {
                for (int j = i * i; j <= arr.length; j += i) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                System.out.println(arr[i]);
        }
    }
}
