package Likelion;

//13,17,19,23이 소수인지 판별하는 알고리즘 만들기

//3번. 제곱근 -2
class PrimeNum01 {
    public boolean result(int arr[]) {
        boolean answer = false;
        for (int i = 2; i * i <= arr.length ; i++) {
            if (arr[i] % i != 0) {
                answer = true;
            }
        }   return answer;
    }
}

public class Nov01 {
    public static void main(String[] args) {
        PrimeNum01 primenum = new PrimeNum01();
        int[] primeArr = {13, 17, 19, 23};
        System.out.println(primenum.result(primeArr));
    }
}

