package Likelion;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

//Nov29: 기수정렬 - 1의 자리로 정렬한 후 10의 자리로 정렬하는 방법
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 18, 13, 1, 7, 16, 7, 0, 14};

        //Queue 10개 생성
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        // 일의 자리가 맞는 곳에 삽입
        for (int i : arr) {
            queueArr[i % 10].add(i); // i % 10해서 일의 자리를 구함
        }

        // 꺼내서 arr에 다시 넣는다
        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while (!queueArr[i].isEmpty()) {
                arr[idx++] = queueArr[i].poll();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}