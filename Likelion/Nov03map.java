package Likelion;

public class Nov03map {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int i = 2;

        while(i<=100) {
            arr[0] = i;
            arr[1] = i*2;
            System.out.printf("[%d, %d]", arr[0], arr[1]);
            System.out.println();
            i++;
        }
    }
}
