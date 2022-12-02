package Likelion.Nov;

//하샤드 수
// 몫 = tmp
// 나머지 = 합에 더하기
// 합 반환

public class Nov07 {
    static int solution(int x) {
        int sum = 0;
        int tmp = 0;

        while (tmp > 0) {
            int a = x % 10;
            tmp = x / 10;

            sum += a;
        }
        return sum;
    }
}
