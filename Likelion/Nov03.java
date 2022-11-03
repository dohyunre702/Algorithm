package Likelion;

import java.util.Arrays;

//에라토스테네스의 체 배열 초기 세팅
public class Nov03 {
    public static void main(String[] args) {
        int N = 50;
        int[] nums = new int[N-1]; //n-1만큼. 2~50 (49개)

        boolean[] checks = new boolean[nums.length]; //nums만큼 checks 생성
        Arrays.fill(checks, true); //checks를 true로 초기화. (기본값 = false라서)
        for (int i = 0; i < nums.length; i++) //2-49까지 nums에 저장
            nums[i] = i+2;
        }
    }

