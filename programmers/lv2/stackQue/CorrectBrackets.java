package programmers.lv2.stackQue;

import java.util.Scanner;
import java.util.Stack;

//올바른 괄호. 반례와의 싸움...
class CorrectBrackets {
    static boolean solution(String s) {
        boolean answer = true;
        //반례: ()))((() ㅏㅏ 이래서 스택을 써야되는구나
        //0. 가장 처음에는 ( 가 추가되어야 함
        //1. 2~n-1번째 괄호는 이전 괄호와 다를 때만 추가.
        //2. 마지막 괄호가 )이어야 함

        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));

        if (s.charAt(0) == ')') return answer = false;

        for(int i = 1; i < s.length()-2; i++) {
            if (s.charAt(i) != s.charAt(i-1)) stk.push(s.charAt(i));
        }
        if (stk.peek() != '(') return answer = true;
        else return answer = false;
    }

    //test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.next();

        System.out.println(solution(example));
    }
}