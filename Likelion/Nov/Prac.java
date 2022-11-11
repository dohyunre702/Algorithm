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
        String answer = "";
        int b = 28;
        while(b>0) {
            answer += b % 2;
            b = b/2;
            //String + int = String
        }
        System.out.println(answer);

        }
    }
