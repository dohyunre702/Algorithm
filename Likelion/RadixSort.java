package Likelion;

import java.util.*;

//Nov29: 기수정렬 - 1의 자리로 정렬한 후 10의 자리로 정렬하는 방법
//각 숫자의 자릿수를 구해서 중복을 제거한 후 오름차순으로 정렬해서 리턴
public class RadixSort {
    public static int[] getDigits(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) set.add(1);
            else set.add((int)(Math.log10(arr[i])+1));
        }

        //중복 제거된 자릿수를 arr에 담기
        int[] answer = new int[set.size()];
        int idx = 0;
        for (Integer num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer); //정렬
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,4,5,9,1,0,20};
        int[] digits = getDigits(arr);
        System.out.println(Arrays.toString(digits));
    }
}