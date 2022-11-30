package programmers.lv1;

//문자열 내 p와 y의 개수
public class PYpyinString {
    boolean solution(String s) {
        s = s.toLowerCase();

        int cntp = 0;
        int cnty = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') cntp += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'y') cnty += 1;
        }

        return cntp == cnty;
    }
}
