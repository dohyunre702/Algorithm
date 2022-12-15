package basics.binarySearch;

import java.util.Scanner;

//문제해결을 위한 창의적 알고리즘(중급)
//리스트가 중복된 값을 포함하고 있을 때,
//그 중복값을 전부 찾거나 중복값을 활용해 문제를 해결해야 할 때
public class LowerBound {
    //[start,end] 안의 원소들 중 key보다 크거나 같은 첫 번째 원소의 인덱스 리턴
    public static int lowerbound(int[] a, int end, int key) {
        int pl = 0;
        int pr = end-1;

        while (pl < pr) {
            int pc = (pl + pr) / 2; //중앙값
            if (a[pc] >= key) pr = pc; //포함한 앞부분 탐색
            else pl = pc + 1; //뒷부분 탐색
        }
        return pr+1;
    }

    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt(); //찾고자 하는 수
    }
}
