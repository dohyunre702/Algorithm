package programmers.lv1;

import java.util.*;

/* 실패율 lv.1 접근 방식 (2)
1. stages 배열에서 0~n까지의 숫자가 각각 몇 개인지 카운트한 새로운 int형 배열 arr 만들기 ok
2. 실패율 = arr[i]/N-arr[i] (이 떄 N은 앞의 arr[i]를 뺀 값을 누적함) = answer[i]
3. answer배열 내림차순 (단, 값이 같으면 오름차순 정렬 << 왠지 기본값일 것 같다)

*/
public class FailRate {
    public void solution(int N, int[] stages) {
        //int[] stages = {2,1,2,6,2,4,3,3};
        int[] answer = new int[N]; //분수 담아야 하므로 float 변환
        int[] arr = new int[N];

        //1. stages 배열에서 i에 해당하는 숫자가 몇 개인지 카운트한 배열 arr 생성
        for(int i=0; i<arr.length-1; i++) {
            int tmp = 0;
            for(int j=0; j<stages.length; j++) {
                if (stages[j] == i+1) {
                    tmp++;
                }
            }
            arr[i] = tmp; //[1,3,2,1,0].ok.
        }

        //2. 실패율 = arr[i]/k-arr[i] (이 떄 N은 앞의 arr[i]를 뺀 값을 누적함) = answer[i]
        //배열에 실수 담기 위해 float형 배열 arrFloat 하나 더 만들기
        float[] arrFloat = new float[N];
        int k = stages.length;
        for(int i = 0; i< arr.length; i++) {
            arrFloat[i] = (float) arr[i] / k;
            k = k - arr[i];
            // arrFloat = [0.125000, 0.428571, 0.500000, 0.500000, 0.000000]
        }

        //3-1. Map으로 idx값 부여하기 (key 중복정렬 안됨.. : idx, value:실패율)
        Map<Integer, Float> arrMap = new HashMap<>();
        for(int i=0; i<arrFloat.length; i++) {
            arrMap.put(i+1, arrFloat[i]);
        }

        // key : value 출력 - for loop (keySet())
        Set<Integer> keySet = arrMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " : " + arrMap.get(key));
            /* 출력
            1 : 0.125
            2 : 0.42857143
            3 : 0.5
            4 : 0.5
            5 : 0.0
             */
        }

        //3-2. value 값 기준으로 내림차순 정렬


        //3-3. 내림차순 정렬 후 key값 추출


    }

    //test코드
    public static void main(String[] args) {
        int[] example = {2,1,2,6,2,4,3,3};
        int a = 5;

        FailRate result = new FailRate();
        result.solution(a,example); //result = [3,4,2,1,5] 여야 함
        System.out.println();

    }
}