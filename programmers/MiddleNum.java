package programmers;

//가운데 글자 가져오기
//중간값 (1) n = 2k+1 > [i]=k / (2) n = 2k > [i]=k-1
public class MiddleNum {
    public String solution(String s) {
        int k = s.length();
        String answer = "";

        if (k % 2 == 0) {
            answer = s.substring((k/2)-1,(k/2)+1);
        } else {
            answer = s.substring((k-1)/2,(k-1)/2+1);
        }
        return answer;
    }
}

//비슷하지만 더 깔끔하게 푼 분 코드
    /*
    String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
     */
