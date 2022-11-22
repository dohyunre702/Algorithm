package Likelion.Nov;

//array에 있는 모든 값 더하기(재귀)
public class Nov22_2 {

    static int sum(int[] arr, int answer, int idx) {
        if(arr.length == idx) return answer;
        return sum(arr, answer + arr[idx], idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 9};
        int r = sum(arr, 0, 0);
        System.out.println(r);
    }
}
