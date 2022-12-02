package Likelion.Nov;


//[1차]비밀지도

/*접근방법 (1)
1. 불러 온 10진수 배열을 2진수로 바꾼다
2. arr1의 인덱스값과 arr2의 인덱스값을 더한다
3. 더한 값이 0이면 "", 1이면 "#"을 반환한다

 */

/*
public class Nov11 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            while (arr1[i] > 0) {
                str[i] += arr1[i] % 2;
                arr1[i] /= 2;
            }
        }

        //char로 바꾸어 String 뒤집기
            char[]input = str.toCharArray();
            char[]output = new char[str.length()];

            for (int j = 0; j < input.length; j++) {
                output[j] = input[input.length-i-1];
            }

            }
        }


 */
//1번 방식
