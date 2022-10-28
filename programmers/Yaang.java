package programmers;

public class Yaang {
    public int solution(int n, int k) {
        int answer;
        int sheep = 12000 * n;
        int drink = 2000;

        if (n < 10)
            answer = sheep + drink * k;
        else
            answer = sheep + drink * (k - (n/10));

        return answer;
        }
    }
