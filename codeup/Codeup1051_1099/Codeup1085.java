package codeup.Codeup1051_1099;

import java.util.Scanner;
//1MB = 1024KB = 1024 * 1024 Byte = 1024 * 1024 * 8 bit.
//float. 정밀도 손실
//왜 안되지??? 왜 0.2?
public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextLong(); //마이크로 소리강약 (1초에 몇 번?)
        float b = sc.nextLong(); //체크 결과 저장하는 비트 (2비트 : 0 or 1, 16비트 : 65536가지)
        float c = sc.nextLong(); //트랙 개수. 모노 1개, 스테레오 2개
        float s = sc.nextLong(); //녹음할 시간

        float result = (float) (h * b * c * s) / (8 * 1024 * 1024);
        System.out.printf("%.1f MB", result);
    }

}
