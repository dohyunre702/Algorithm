package Likelion.Oct.Oct24;

import java.util.*;
//K번쨰 수 리팩토링. For each문 사용

public class KthNumRefactor01 {
    public int[] solution(int[]arr, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int[] slicedArr = Arrays.copyOfRange(arr, command[0] - 1, command[1]);
            Arrays.sort(slicedArr);
            answer[idx++] = slicedArr[command[2] - 1];
        }
        return answer;
    }

}
