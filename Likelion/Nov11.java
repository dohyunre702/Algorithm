package Likelion;

//[1차]비밀지도

/*접근방법 (1)
1. 불러 온 10진수 배열을 2진수로 바꾼다
2. arr1의 인덱스값과 arr2의 인덱스값을 더한다
3. 더한 값이 0이면 "", 1이면 "#"을 반환한다

접근방법 (2)
1. 두 이진수를 더한다.
2. 2의 n승-1보다 크면 앞의 자릿수를 자른다
3. 1일 때 "#", 0일 떄 "" 반환
 */

//1번 방식
public class Nov11 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arrtwo = new String[n];

        for(int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(Integer.toBinaryString(arr1[i]));
            arr2[i] = Integer.parseInt(Integer.toBinaryString(arr2[i]));

        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(39));
    }
}