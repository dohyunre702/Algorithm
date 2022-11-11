package Likelion.Nov;

import Likelion.Nov11;

import java.util.ArrayList;
import java.util.List;

//10진수 2진수로 변환
public class Prac {
    public static void main(String[] args) {

        //1. 메서드
        String a = Integer.toBinaryString(28);
        System.out.println(a);
        //11100

        //2. 나누기
        //10진수 int를 2진수 string으로
        String tmp = "";
        int b = 28;
        while(b>0) {
            tmp += b % 2;
            b /= 2;
            //String + int = String
        }

        //char로 바꾸어 String 뒤집기
        char[]input = tmp.toCharArray();
        char[]output = new char[tmp.length()];

        for (int i = 0; i < input.length; i++) {
            output[i] = input[input.length-i-1];
        }
        String answer = new String(output);

        System.out.println(answer);
        }


    }
