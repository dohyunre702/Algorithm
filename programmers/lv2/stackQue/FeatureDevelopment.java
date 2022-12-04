package programmers.lv2.stackQue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//기능 개발
public class FeatureDevelopment {
    public static void solution(int[] progresses, int[] speeds) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        int cnt = 0;

        //몇 일 걸리는지
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = (int) Math.ceil((100-progresses[i]) / speeds[i]);
        }

        int j = 0;
        //스택이 비어 있으면 원소 넣기
        while (j < progresses.length-1) {
            if (stk.isEmpty()) {
                stk.add(progresses[j]);
                cnt++;
            }

            //if [i] >= [i+1] : [i+1] 삽입, cnt++
            if (stk.peek() >= progresses[j+1]) {
                stk.add(progresses[j+1]);
                cnt++;
            } else { //cnt 반환해 answer에 넣기, 스택 비우고 cnt 초기화
                ans.add(cnt);
                cnt = 0;
                stk.clear();
            }
            j++;
        }

        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d, ", answer[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {95, 90, 99, 99, 80, 99};
        int[] arr2 = {1, 1, 1, 1, 1, 1};

        FeatureDevelopment.solution(arr1, arr2);

    }
 }
