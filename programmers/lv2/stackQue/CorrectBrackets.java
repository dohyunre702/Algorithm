package programmers.lv2.stackQue;

import java.util.Scanner;
import java.util.Stack;

//올바른 괄호. for 내 조건 풀이
class CorrectBrackets {
    static boolean solution(String s) {
        boolean answer = true;
        //반례: ()))((() ㅏㅏ 이래서 스택을 써야되는구나
        //0. 가장 처음에는 ( 가 추가되어야 함
        //1. 2~n-1번째 괄호는 이전 괄호와 다를 때만 추가.
        //2. 마지막 괄호가 )이어야 함

        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') //현재 ( 가 들어갈 자리면 스택에 넣기
                stk.push(s.charAt(i));
            else {
                if (stk.isEmpty()) return false; //현재 )가 들어갈 자리인데 스택 비어있을 때
                else stk.pop(); //현재 )가 들어갈 자리인데 스택에 ( 가 있는 경우 pop
            }
        }
        answer = (stk.isEmpty()) ? true : false;
        return answer;
    }

    //test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.next();

        System.out.println(solution(example));
    }
}