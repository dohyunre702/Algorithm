package Likelion;
//모의고사

//정답과 비교하려면 먼저 배열 길이를 맞춰주어야 한다
//길이 맞추기 > 몫만큼 곱해서 반복하고 나머지 더해주기
//각 배열을 answers과 비교해 값이 같으면 count++
//새로운 배열에 count의 최대값 넣기
//리스트?

import java.util.ArrayList;

public class Oct31 {
    public int[] solution(int[] arr) {
        int[] result = new int[3];
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,1,2,3,2,4,2,5};
        int[] array3 = {3,3,1,1,2,2,4,4,5,5};

        ArrayList<Integer> list = new ArrayList<>();


        int firstStudentAnswerCnt = 0;
        System.out.println(firstStudentAnswerCnt);

        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
