package programmers.lv2.heap;

//lv2. 더 맵게
/*
while(pq.peek() < k) 동안 poll, 섞기, 섞은 것 pq에 넣기 + answer++
 */

import java.util.PriorityQueue;

public class ScovilleSample {
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        //섞기
        int answer = 0;
        while(pq.size() >=2 && pq.peek() < K) {
            int a = pq.poll();
            int b = pq.poll();
            pq.add(a+ (b*2));
            answer++;
        }

        if(pq.peek() < K) return -1;
        return answer;
    }
}
