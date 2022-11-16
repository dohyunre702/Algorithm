package programmers.lv1;

/* 실패율 lv.1 접근 방식 (2)
1. stages 배열에서 0~n까지의 숫자가 각각 몇 개인지 카운트한 새로운 int형 배열 arr 만들기 ok
2. 실패율 = arr[i]/N-arr[i] (이 떄 N은 앞의 arr[i]를 뺀 값을 누적함) = answer[i]
3. answer배열 내림차순 (단, 값이 같으면 오름차순 정렬 << 왠지 기본값일 것 같다)

*/
public class FailRate {
    public void solution(int N, int[] stages) {
        //int[] stages = {2,1,2,6,2,4,3,3};
        int[] answer = new int[N];
        int[] arr = new int[N];

        //stages 배열에서 i에 해당하는 숫자가 몇 개인지 카운트한 배열 arr 생성
        for(int i=0; i<arr.length-1; i++) {
            int tmp = 0;
            for(int j=0; j<stages.length; j++) {
                if (stages[j] == i+1) {
                    tmp++;
                }
            }
            arr[i] = tmp; //[1,3,2,1,0].ok.
        }

        //실패율 = arr[i]/N-arr[i] (이 떄 N은 앞의 arr[i]를 뺀 값을 누적함) = answer[i]
        //아 분수 표현 어떻게 하지
        for(int i = 0; i< arr.length; i++) {
            answer[i] = arr[i] / N;
            N = N - arr[i];
        }

        //출력용
        for(int i = 0; i < answer.length; i++) {
            System.out.printf("%d, ", answer[i]);
        }
    }

    //test코드
    public static void main(String[] args) {
        int[] example = {2,1,2,6,2,4,3,3};
        int a = 5;

        FailRate result = new FailRate();
        result.solution(a,example);
    }
}