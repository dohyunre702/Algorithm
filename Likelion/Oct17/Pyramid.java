package Likelion.Oct17;

public class Pyramid {
    /*
       *
      * *
     * * *
    * * * *
    //직각삼각형은 * 개수에만 신경쓰면 됨
    //피라미드는 * 위치에도 신경을 써야 함
     */
    public void welcomeToEgypt(int n) {
        for (int i = 0; i < 4; i++) {
            // for문을 하나 더 쓰고
            // pintln 말고 print, printf 등을 써서 한줄로 출력
            for (int j = 0; j <=4-i-1 ; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pyramid print = new Pyramid();
        print.welcomeToEgypt(4);

    }
}

/*
엥 거꾸로 출력?
* * * *
* * *
* *
*
 */