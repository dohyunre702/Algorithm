package Likelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//나누어 떨어지는 숫자배열
//1. list
public class Nov07_2 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        int[] answer = new int [list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
