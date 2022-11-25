package Likelion;

//GCD without recursion
public class Nov25 {
    public static void main(String[] args) {
        int a = 196;
        int b = 42;
        while(a!=b) {
            if(a > b) {
                a = a - b;
            } else if (a<b) {
                b = b - a;
            }
        }
        System.out.printf("%d, %d", a, b);
    }
}
