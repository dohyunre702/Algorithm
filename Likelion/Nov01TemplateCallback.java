package Likelion;

//템플릿 콜백 적용 예시
public class Nov01TemplateCallback {
    boolean someOperation(int a, int b) {
        return a < b;
    }
    boolean isPrime(int num) {
        for (int i =2; someOperation(i, num); i++) { //메서드 콜백
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
