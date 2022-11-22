package Likelion.Nov;

import java.util.ArrayList;
import java.util.List;

//list의 모든 값 더하기
public class Nov22_1 {
    public static int sum(List<Integer> nums) {
        if(nums.isEmpty()) return 0;
        int last = nums.remove(nums.size() - 1);
        return last + sum(nums);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
    }
}
