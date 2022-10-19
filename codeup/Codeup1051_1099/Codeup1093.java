package codeup.Codeup1051_1099;

//String으로 "공백을 포함한" 문자열 입력받음 > readLine() 사용해야 함.
//split으로 (regex:" ") 나누어 배열 만들기
//arr 배열 안에서 split 배열 돌리면서
//split 배열의 값이 arr 배열의 인덱스와 같으면
//arr 배열의 값에 ++1
//arr 배열 출력

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Codeup1093 {

    public void attention (String[] arr) {
        int[] nameCnt = new int[24]; //[0]~[23]
        for (int i = 0; i < nameCnt.length; i++) { //[0]~[23]
            nameCnt[i] = 0;
            for (int j = 0; j < arr.length; j++) { //[0]~[9]
                if (Integer.parseInt(arr[j]) == i) {
                    nameCnt[i]++;
                }
            }
        }
        for (int i = 0; i < nameCnt.length-1; i++) {
            System.out.printf("%d ",nameCnt[i+1]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = br.read();
        String[] call = br.readLine().split(" ");

        Codeup1093 checkCnt = new Codeup1093();
        checkCnt.attention(call);
    }
}
