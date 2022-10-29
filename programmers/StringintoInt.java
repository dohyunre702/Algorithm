package programmers;

//string.charAt[0]과 나머지를 나누고
//나머지를 Integer.parseInt()로 바꿔서
//string.charAt[0] = '0'이면 그대로 반환, 아니면 * -1 하기

//java는 부호도 변환해준다(!)
//다른 풀이 힌트 : 문자를 아스키코드로 바꿔 연산하기

public class StringintoInt {
    public int solution(String s) {
        int answer = 0;
        char front = s.charAt(0);

        if (front == '-') {
            answer = Integer.parseInt(s.substring(1)) * (-1);
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }

}
