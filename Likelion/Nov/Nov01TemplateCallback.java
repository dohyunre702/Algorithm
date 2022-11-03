package Likelion.Nov;

interface StatementStrategy {
    boolean compare(int a, int b);
}

//템플릿 콜백 적용 예시
public class Nov01TemplateCallback {
    boolean isPrime(int num, StatementStrategy stmt) { //인터페이스 콜백
        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Nov01TemplateCallback tcp = new Nov01TemplateCallback();
        //람다
        System.out.println(tcp.isPrime(13, (a, b) -> a < b));
        System.out.println(tcp.isPrime(17, (a, b) -> a < b / 2));
        System.out.println(tcp.isPrime(19, (a, b) -> a * a < b));
    }
}