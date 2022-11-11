package Likelion.Nov;

//비밀지도
/*
접근방법 (2) 비트연산
        1. 두 이진수를 더한다.
        2. 2의 n승-1보다 크면 앞의 자릿수를 자른다
        3. 1일 때 "#", 0일 떄 "" 반환
 */
public class Nov11_2 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
           String[] answer = new String[n];

           for(int i = 0; i < n; i++) {
               answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
           }

           for(int i = 0; i<n; i++) {
               answer[i] = " ".repeat(n-answer[i].length()) + answer[i]; //자릿수 채워주기
               answer[i] = answer[i].replace("1","#");
               answer[i] = answer[i].replace("0"," ");
           }
           return answer;
        }
    }
