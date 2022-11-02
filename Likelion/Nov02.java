package Likelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//소수찾기 - 에라토스테네스의 체 수정완
public class Nov02 {
    public void solution(int n) {
        List<Integer> numlist = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            numlist.add(i);
        }

        for (int j = 0; j < numlist.size(); j++) {
            if (numlist.get(j) % 2 == 0) {
                numlist.remove(j);
            }
        }
        //출력
        System.out.println(numlist);
        System.out.println(numlist.size());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Nov02 result = new Nov02();
        result.solution(x);
    }
}