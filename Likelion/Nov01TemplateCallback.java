package Likelion;

interface StatementStrategy {
    boolean compare(int a, int b);
}

//템플릿 콜백 적용 예시
public class Nov01TemplateCallback {
    /* a<b는 어디로 가지?
    boolean someOperation(int a, int b) {
        return a < b;
    }

     */
    boolean isPrime(int num, StatementStrategy stmt) { //인터페이스 콜백
        for (int i =2; stmt.compare(i, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Nov01TemplateCallback tcp = new Nov01TemplateCallback();
        boolean r = tcp.isPrime(17);
        System.out.println(r);
    }
}
