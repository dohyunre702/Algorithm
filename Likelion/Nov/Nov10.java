package Likelion.Nov;

import java.util.*;

//같은 숫자는 싫어
public class Nov10 {
    public int[] solution(int[] arr) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(arr[0]);

        //배열의 idx[i]값을 리스트의 마지막 값과 비교해 같은 숫자가 없으면 add
        for (int i = 1; i < arr.length; i++) {
            if (list1.get(list1.size()-1) != arr[i])
                list1.add(arr[i]);
            }

        int[] answer = new int[list1.size()];

        //integer list를 int array로 변경
        for (int i = 0; i < list1.size(); i++) {
            answer[i] = list1.get(i).intValue();
        }

        return answer;
    }
}