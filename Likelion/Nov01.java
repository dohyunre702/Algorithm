package Likelion;

//13,17,19,23이 소수인지 판별하는 알고리즘 만들기

//3번 template callback 적용 연습

class PrimeNum01{
    boolean operation(int a, int b) {
        return a <= b;
    }
    //callback 1단계 적용
    public boolean result01(int arr[]) {//callback
        for (int i = 2; operation(i, arr.length) ; i++) {
            if (arr[i] % i != 0) {
               return true;
            }
        }   return false;
    }

    public boolean result02(int arr[]) {
        boolean answer = false;
        for (int i = 2; i <= (int)arr.length/2 ; i++) {
            if (arr[i] % i != 0) {
                answer = true;
            }
        }   return answer;
    }

    public boolean result03(int arr[]) {
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

