package Likelion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,4,9,10,223,111,23,3,39};

        for(int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]) minIdx = j;
            }
            int tmp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=tmp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
