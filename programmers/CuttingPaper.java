package programmers;

//종이 자르기
public class CuttingPaper {
    public int solution(int M, int N) {
        int answer = (M-1) + (N-1)*M;
        // = M*N -1
        return answer;
    }
}
