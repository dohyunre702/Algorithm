package codeup.sort;

import java.util.Scanner;

public class Codeup1441 {

    //버블정렬
    static void bubbleSort(int[] arr) {
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

        //출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        //주어지는 숫자를 중복이 없는 배열로 변환해 입력해야 한다. 아니 난데없이 여기서 막히네..
        /*
        - 숫자는 enter을 기준으로 입력됨 (몇 개가 입력되는지는 알 수 없음)
        - 입력값을 리스트에 할당
        - 리스트를 hashset으로 변환
        */

        int[] exampleArr = {};

        bubbleSort(exampleArr);
    }
}
