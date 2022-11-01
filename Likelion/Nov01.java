package Likelion;

//13,17,19,23이 소수인지 판별하는 알고리즘 만들기
//배열 1개 만든다.

//1. 단순 나눗셈 : n % i = 0이 있으면 0
//빈 배열을 만들고, n % i = 0이라면 [i] ++
//[i] == 0인 인덱스의 개수 구하기

public class Nov01 {
    public boolean primeNum(int a) {
        for (int i = 0; i < a; i++) {
            if (a % i == 0) {

            }
        }                 return true;
    }

    //배열로 구해보기
    public boolean primeNum2(int[] arr) {
        int[] primeArr = {13, 17, 19, 23};

    }
}

