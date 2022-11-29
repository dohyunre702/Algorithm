package Likelion;

import java.util.Arrays;

//Nov29
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,4,5,9,1,0};
        int[] redixArr = new int[10];
        Arrays.fill(redixArr, -1);

        //배열에서 꺼내 넣기
        for (int i: arr) {
            redixArr[i] = i;
        }
        //[0, 1, -1, -1, 4, 5, -1, 7, -1, 9]

        //1개씩 꺼내 arr에 넣기
        int cnt = 0;
        for (int i = 0; i < redixArr.length; i++) {
            if(redixArr[i] != -1) {
                arr[cnt++] = redixArr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        //[0, 1, 4, 5, 7, 9]
    }
}
