package programmers.lv2.heap;

//lv2. 더 맵게
/*
while(pq.peek() < k) 동안 poll, 섞기, 섞은 것 pq에 넣기 + answer++
 */

import java.util.PriorityQueue;

public class Hotter {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        //while
        while(pq.peek() < K) {

        }
        return answer;
    }
}
