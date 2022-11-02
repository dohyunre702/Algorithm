package Likelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//소수찾기 - 에라토스테네스의 체
public class Nov02 {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();

        int n = 10;
        for (int i = 2; i <= n; i++) {
            numlist.add(i);
        }

        for (int j = 0; j < numlist.size(); j++) {
            if (numlist.get(j) % 2 == 0) {
                numlist.remove(j);
            }
        }

        System.out.println(Arrays.toString(numlist.toArray()));
        System.out.println(numlist.size());

    }
}