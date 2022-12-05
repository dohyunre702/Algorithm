package programmers.lv2.sorting;

import java.util.Arrays;
import java.util.Comparator;

//lv2. 가장 큰 수
public class MaxNum {
    public static String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        //String 배열로 변환
        for(int i = 0; i < numbers.length; i++) {
            str[i] = Integer.toString(numbers[i]);
        }

        //두 수를 번갈아가며 합친 수 중 큰 값을 내림차순 정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        //0일 때 비교
        if (str[0].equals("0")) return "0";

        //문자열 합치기
        String answer = String.join("", str);
        return answer;
    }

    //test
    public static void main(String[] args) {
        int[] arr1 = {3, 30, 34, 5, 9, 72, 275, 272, 27, 850, 1000, 300};
        System.out.println(solution(arr1));;

    }
}
