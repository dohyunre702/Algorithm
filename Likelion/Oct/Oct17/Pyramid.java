package Likelion.Oct.Oct17;

public class Pyramid {
    /*
       *
      ***
     *****
    *******
    //직각삼각형은 * 개수에만 신경쓰면 됨
    //피라미드는 * 위치에도 신경을 써야 함
     */
    public void welcomeToEgypt(int n) {
        for (int i = 0; i < n; i++) {
            //j는 공백
            for (int j = n-1-i; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main (String[]args){
        Pyramid print = new Pyramid();
        print.welcomeToEgypt(4);
        }
    }