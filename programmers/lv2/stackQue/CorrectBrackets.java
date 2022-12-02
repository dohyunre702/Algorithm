package programmers.lv2.stackQue;

//올바른 괄호
class CorrectBrackets {
    boolean solution(String s) {
        boolean answer = true;

        //1. 처음에 (로 시작해야 한다
        //2. 마지막에 )로 끝마쳐야 한다

        //문자열을 배열로 나누고, 첫 번째 인덱스 값이 '(' and 마지막 인덱스 값이 ')' 면 true
        char[] charArr = s.toCharArray();
        if (charArr[0] == '(' && charArr[s.length()-1] == ')')
            answer = true;
        else answer = false;

        return answer;
    }
}