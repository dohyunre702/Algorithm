package Likelion;

//13,17,19,23이 소수인지 판별하는 알고리즘 만들기

//1. 단순 나눗셈 : n % i = 0이 있으면 0

class PrimeNum01 {
    public boolean result(int arr[]) {
        boolean answer = false;
        for (int i = 2; i <= arr.length; i++) {
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

