package Likelion.Nov;

/*
1. 2~50이 들어있는 배열을 만들고
2. 2를 제외한 2의 배수를 모두 지웁니다. 3을 제외한 3의 배수를 모두 지웁니다
... i * i <= N 까지 반복 합니다.
 */

public class Nov14 {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n-1];

        //2를 제외한 2의 배수를 0으로 만들기
        for (int i = 0; i* i <= n; i++) {
            System.out.println("i:" + i);
            if (arr[i] != 0) {
                for (int j = i * 2 + 2; j < arr.length; j += arr[i]) {
                    System.out.println(j);
                    arr[j] = 0;
                }
            }
        }

    }
}
