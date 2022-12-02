package programmers.lv2.stackQue;

import java.util.Scanner;
import java.util.Stack;

//올바른 괄호
class CorrectBrackets {
    static boolean solution(String s) {
        boolean answer = true;
        //1. 처음에 (로 시작해야 한다
        //2. 마지막에 )로 끝마쳐야 한다
        //3. (와 )의 수가 같아야 한다

        int a = 0; int b = 0;

        char[] charArr = s.toCharArray();

        //() 3번 조건 체크하기 위한 반복문
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(') a++;
            else b++;
        }

        //조건 체크
        if (a == b) {
            if (charArr[0] == '(' && charArr[charArr.length - 1] == ')')
                answer = true;
            else answer = false;
        } else answer = false;
        return answer;
    }

    //test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.next();

        System.out.println(solution(example));
    }
}