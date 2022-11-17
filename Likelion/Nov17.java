package Likelion;

import java.util.Arrays;

public class Nov17 {
    public int[] sort(int[] arr,int startIdx, int endIdx) {
        int pivot = arr[arr.length/2];
        System.out.println(pivot);
        int leftIdx = startIdx;
        int rightIdx = endIdx;

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
        System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx); // 5, 6
        System.out.println(Arrays.toString(arr));

        // 교환이 모두 끝나면 왼쪽, 오른쪽 두 그룹으로 나누어 지면 됩니다.
        // 20, 18, 5, 19, 25, 5, 50, 40

        if(startIdx < rightIdx) sort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        Nov17 stt = new Nov17();
        var r = stt.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(r));
    }
}
