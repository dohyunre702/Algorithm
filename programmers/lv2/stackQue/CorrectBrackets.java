package programmers.lv2.stackQue;

import java.util.Stack;

//올바른 괄호
class CorrectBrackets {
    boolean solution(String s) {
        boolean answer = true;
        //1. 처음에 (로 시작해야 한다
        //2. 마지막에 )로 끝마쳐야 한다

        //stack 사용
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        if (stk.peek() != '(') answer = false;
        else {
            for (int i = 1; i < s.length(); i++) {
                stk.push(s.charAt(i));
            }
            if (stk.peek() != ')') answer = false;
            else answer = true;
        }
        return answer;
    }
}