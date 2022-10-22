package programmers;

import java.util.Scanner;

public class SoobakSoobakSoo {
//String Array to string 2. StirngBuilder.Append()
    public String solution(int n) {
        String answer = "";

        //들어온 길이만큼의 String배열을 만든다.
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i % 2 == 0) { //인덱스를 짝수 홀수로 나눠서
                arr[i] = "수"; //짝수, 0에 "수"를 넣고.
            } else {
                arr[i] = "박"; //홀수에 "박"을 넣어 저장.
            }
        }

        //StringBuilder 객체 생성
        StringBuilder sbArr = new StringBuilder();

        for (int j = 0; j < arr.length; j++) {
            sbArr.append(arr[j]); //문자열 객체에 요소 저장
        }
        answer = sbArr.toString();

        return answer;
        /* 반환타입이 void일 때 유효. 문제에는 String이라서 안됨
        //n이 들어올 때 index값을 따져서 그때까지의 값을 반환
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
        */

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        SoobakSoobakSoo tt = new SoobakSoobakSoo();
        System.out.print(tt.solution(input));
    }
}
