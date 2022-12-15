package basics.binarySearch;

import java.util.Scanner;

public class LinearStructureSearch {
    public static int linearStructureSearch(int[] a, int k, int b) {
        //{1, 2, 3, 5, 7, 9, 11, 15}, 8, 11일 때
        int pl = 0; //탐색범위 시작
        int pr = k-1; //탐색범위 끝
        do {
            int pc = (pl + pr)/2; //중앙값
            if (b == a[pc]) {
                return pc + 1; //원소의 위치(x인덱스값) 반환
            } else if (b < a[pc]) { //주어진 수가 중앙값보다 작을 때
                pr = pc - 1; //끝 영역 변경
            } else { //b > a[pc]. 주어진 수가 중앙값보다 클 때
                pl = pc + 1; //시작 영역 변경
            }
        } while (pl <= pr); //더 이상 탐색할 요소가 없을 때까지

        return -1; //탐색 실패 시 -1 반환
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

        System.out.println(linearStructureSearch(arr, n, x)); //함수 호출

    }
}

