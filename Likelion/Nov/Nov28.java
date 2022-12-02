package Likelion.Nov;

public class Nov28 {
    public static void printAtoZ(String prefix){
        if (prefix.length() > 3) return;
        System.out.println(prefix);

        for(char c = 'A'; c<='Z'; c++) {
            printAtoZ(prefix + c);
        }
    }

    public static void main(String[] args) {
        printAtoZ("");
    }
}
