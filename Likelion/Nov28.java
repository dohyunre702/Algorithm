package Likelion;

public class Nov28 {
    public static void printAtoZ(char c){
        if (c > 'Z') return;
        else {
            System.out.println(c);
            printAtoZ((char) (c+1));
        }
    }

    public static void main(String[] args) {
        printAtoZ('A');
    }
}
