package Likelion;

import java.util.Arrays;

public class Nov17 {
    public int[] sort(int[] arr,int startIdx, int endIdx) {
        int pivot = arr[arr.length/2];
        System.out.println(pivot);
        int leftIdx = 0;
        int rightIdx = arr.length-1;

        //아래반복
        while(leftIdx <= rightIdx)
            while(arr[leftIdx]<pivot)leftIdx +=1;
            while(arr[rightIdx]>pivot)rightIdx-=-1;

            if(leftIdx <= rightIdx) {
                int temp=arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx +=1;
                rightIdx -=1;
            }
        System.out.printf("4:%d 7:%d\n", arr[4], arr[7]); // 25, 40
        System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx); // 5, 6
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
