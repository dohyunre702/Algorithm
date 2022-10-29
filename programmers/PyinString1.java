package programmers;

//문자열 내 p와 y의 개수
class PyinString1 {
    boolean solution(String s) {
        boolean answer = true;
        int cntp = 0;
        int cnty = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                cntp += 1;

            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                cnty += 1;
        }

        if (cntp == cnty) {
            return true;
        } else {
            return false;
        }
    }
}