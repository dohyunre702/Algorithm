package programmers.lv1;

//문자열 내 p와 y의 개수
public class PYpyinString {
    boolean solution(String s) {
        char[] arr = new char[s.length()];
        boolean answer = true;
        int cntp = 0;
        int cnty = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'p' || arr[i] == 'P')
                cntp += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'y' || arr[i] == 'Y')
                cnty += 1;
        }

        if (cntp == cnty) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
