package programmers.lv1;

/*실패율 lv.1 접근 방식 (1)
1. 배열을 리스트로 바꾼다
2. tmp 리스트를 하나 만든다. for문을 돌려서, i가 list[i]와 같으면 tmp[i]에 count를 넣어 준다.
3. 사용한 list[i]는 리스트에서 제거한다.
4. tmp[i] 기준 내림차순 정렬한다.
5. 만약 요소의 수가 같으면 i 기준으로 오름차순 정렬한다.
6. 완성되면 tmp 리스트를 int 배열로 변환한다 (answer 배열).

// 이 방법은 불가. 리스트는 그때그때 추가하기 때문에 배열처럼 사이즈를 책정하거나 변수를 할당하고 시작할 수가 없다.
이게 쓸려면 얘네가 갖고 있는 제약 사항을 잘 알아야 하는구나ㅎ..
*/

import java.util.ArrayList;
import java.util.List;

public class FailRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        //stages를 리스트 변환하기 (stagesList)
        List<Integer> stagesList = new ArrayList<>();
        for (Integer item : stages) {
            stagesList.add(item);
        }

        List<Integer> tmp = new ArrayList<>(N); //tmp의 사이즈는 N이다.
        int cnt = 0;
        for (int i = 1; i < N+1; i++) {
            if (i == stagesList.get(i)) {
                cnt++;
                tmp[i] = cnt;

            }
        }

        return answer;
    }
}