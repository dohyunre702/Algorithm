package Likelion.Oct24;

import java.util.*;

class KthNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        //{1,5,2,6,3,7,4} [2 5 3][4 4 1][1 7 3] //[5 6 3]
        int k = 0;

        for (int i = 0; i < commands.length; i++) { //commands의 길이로 돌려버림 (길이 고정되어 있으므로)
            int[] slicedArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(slicedArr); //잘라진 arr1을 오름차순 정렬 {2,3,5,6}
            k = commands[i][2];
            answer[i] = slicedArr[k-1]; //인덱싱 잘 하자
        }
        return answer;
    }
}
