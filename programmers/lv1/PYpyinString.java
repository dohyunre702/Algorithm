package programmers.lv1;

//문자열 내 p와 y의 개수
public class PYpyinString {
    boolean solution(String s) {
        s = s.toLowerCase();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') cnt++;
            else if (s.charAt(i) == 'y') cnt--;
        }

        if (cnt == 0) return true;
        else return false;
    }
}
