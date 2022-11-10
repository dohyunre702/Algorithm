package Likelion;

import java.util.*;

//같은 숫자는 싫어
public class Nov10 {
    public Object[] solution(int[] arr) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] != arr[j]) {
                    list1.add(arr[i]);
                }
            }
        }
        Object[] answer = list1.toArray();

        return answer;
    }
}