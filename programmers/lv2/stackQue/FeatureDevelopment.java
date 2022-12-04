package programmers.lv2.stackQue;

//기능 개발
/* 문제 분석 + 접근 방법 생각 25분
1. 100 - progresses 의 각 인덱스값 : 몇일 걸리는지
2. int a 선언 (= 스택의 첫 번째 값)
3. 스택이 비어 있으면 첫 번째 원소 넣기
4. 첫 번째 원소와 다음 원소 값 비교 [i], [i+1]
  1) if [i] >= [i+1] : [i+1] 삽입
  2) else if [i] < [i+1]
    - 맨 처음 들어간 스택 값(int a) 반환해 answer에 넣기
    - 스택 비우기
    - [i+1] 삽입, int a에 해당 값 초기화
 */
public class FeatureDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        return answer;
    }


    public static void main(String[] args) {
        int[] arr1 = {95, 90, 99, 99, 80, 99};
        int[] arr2 = {1, 1, 1, 1, 1, 1};
        }

    }
