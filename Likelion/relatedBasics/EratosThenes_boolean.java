package Likelion.relatedBasics;

public class EratosThenes_boolean {
    //1. boolean 배열 사용
    int N = 50;
    boolean[] arr = new boolean[N+1];

    static boolean[] primeNumCheck(boolean[] b, int n) {
        b[0] = true; //소수면 false, 소수가 아니면 true
        b[1] = true;

        for(int i = 2; i * i < n; i++) {
            if(!b[i]) {
                for (int j = i * i; j <= n; j += i) {
                    //2를 제외한 2의 배수는 2로 나뉘어지거나 소수가 아님
                    b[j] = true;
                }

            }
        }   return b;
    }
}

