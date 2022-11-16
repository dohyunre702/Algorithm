package programmers;

/*실패율 lv.1
접근 방식
1. 배열을 리스트로 바꾼다
2. tmp 리스트를 하나 만든다. for문을 돌려서, i가 list[i]와 같으면 tmp[i]에 count를 넣어 준다.
3. 사용한 list[i]는 리스트에서 제거한다.
4. tmp[i] 기준 내림차순 정렬한다.
5. 만약 요소의 수가 같으면 i 기준으로 오름차순 정렬한다.
6. 완성되면 tmp 리스트를 int 배열로 변환한다 (answer 배열)
 */
public class FailRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N+1];
        return answer;
    }
}
