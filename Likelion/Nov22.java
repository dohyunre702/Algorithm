package Likelion;

//재귀 구현
public class Nov22 {

    //재귀 호출 1. 자기 자신 호출 - Stack Overflow
    public static void number1(int n) {
        System.out.println(n);
        number1(n); //자기 자신 호출
    }

    //탈출 조건 넣기
    //결과: 여전히 무한 루프. n이 100에 도달 못함
    public static void number2(int n) {
        if(n == 100) { //n>100이어도 마찬가지
            return;
        }
        System.out.println(n);
        number2(n);
    }

    //1씩 커지는 로직
    public static void number3(int n) {
        if(n > 100) return;
        System.out.println(n);
        number3(n+1);
    }


}
