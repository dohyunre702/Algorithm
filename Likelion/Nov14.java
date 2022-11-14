package Likelion;

/*
1. 2~50이 들어있는 배열을 만들고
2. 2를 제외한 2의 배수를 모두 지웁니다. 3을 제외한 3의 배수를 모두 지웁니다
... i * i <= N 까지 반복 합니다.
 */

public class Nov14 {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n-1];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 2; //2~50까지
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = 0;
        }
    }
}
