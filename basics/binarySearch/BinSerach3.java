package basics.binarySearch;

import java.util.Scanner;

//재귀로 구현
public class BinSerach3 {
    public static int binSearch3(int[] a, int start, int end, int key) {
        int pl = 0; //검색 시작 범위
        int pr = end - 1; //검색 끝 범위
        int pc = (pl + pr) / 2;

        if (pl > pr) return -1;
        if(a[pc] == key) return pc+1;
        if(a[pc] < key) return binSearch3(a, pl, pc+1, key);
        else return binSearch3(a, pc-1,pr, key);
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

        System.out.println(binSearch3(arr, 0, n, x)); //함수 호출
    }
}