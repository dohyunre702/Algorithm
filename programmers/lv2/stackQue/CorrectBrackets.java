package programmers.lv2.stackQue;

import java.util.Scanner;

//올바른 괄호. for 내 조건 풀이
class CorrectBrackets {
    static boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            if (s.charAt(i) == ')') count--;
            if (count < 0) break;
        }
        if (count == 0) answer = true;
        return answer;
    }

    //test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.next();

        System.out.println(solution(example));
    }
}