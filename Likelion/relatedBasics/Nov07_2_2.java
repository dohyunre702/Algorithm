package Likelion.relatedBasics;

import java.util.PriorityQueue;

//나누어 떨어지는 숫자배열
//2. 우선순위 큐
public class Nov07_2_2 {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        int[] answer = new int[list.size()];
        int idx = 0;
        while(!list.isEmpty()){
            answer[idx++] = list.poll();
        }
        return answer;
    }
}
