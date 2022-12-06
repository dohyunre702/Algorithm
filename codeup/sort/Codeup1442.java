package codeup.sort;


public class Codeup1442 {

    //선택 정렬
    static void selectionSort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[0];
            if (arr[i] < tmp) tmp = arr[i];
            arr[i-1] = tmp;
        }
    }

    public static void main(String[] args) {
        //주어지는 숫자를 중복이 없는 배열로 변환해 입력해야 한다.
        int[] exampleArr = {};

        selectionSort(exampleArr);
    }
}
