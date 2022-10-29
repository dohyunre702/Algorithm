package programmers;
import java.util.*;

//자연수 뒤집어 배열로 만들기
//통과는 되었으나 효율적이지는 않은 것 같다.
//더 숙달되어야 하는 부분 : 형변환
//다음 번에 풀 때 힌트 : 나눗셈, 인덱스 거꾸로

public class NumbertoArray {
    static int[] solution(long n) {
        String str = Long.toString((int) n);
        int[] arr = new int[str.length()];
        for(int i = 0; i< str.length(); i++) {
            arr[str.length()-i-1] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return arr;
        }

    //test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(solution(num));
    }

}
