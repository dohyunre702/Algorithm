package codeup.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//정렬된 두 배열 합치기 = 병합 정렬 사용해야 할 듯
public class Codeup1445 {
    public static void merge(int[] arr1st, int[] arr2nd, int a, int b) {
        int[] mergeArray = new int[a+b];

        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < a && pb < b) {
            mergeArray[pc++] = (arr1st[pa] <= arr2nd[pb]) ? arr1st[pa++] : arr2nd[pb++];
            }

        while (pa < a) {
            mergeArray[pc++] = arr1st[pa++];
        }

        while(pb < b) {
            mergeArray[pc++] = arr2nd[pb++];
        }

        for(int i = 0; i < mergeArray.length; i++) {
            System.out.printf("%d ", mergeArray[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        //두 배열의 크기 n,m 한 줄에 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //첫 번째 배열의 원소들이 오름차순으로 정수로 입력
        String[] arr1 = br.readLine().split(" ");
        int[] arrN = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
            arrN[i] = Integer.parseInt(arr1[i]);
        }

        //두 번째 배열의 원소들이 오름차순으로 정수로 입력
        String[] arr2 = br.readLine().split(" ");
        int[] arrM = new int[arr2.length];

        for(int i = 0; i < arr2.length; i++) {
            arrM[i] = Integer.parseInt(arr2[i]);
        }

        merge(arrN, arrM, n, m);
    }
}
