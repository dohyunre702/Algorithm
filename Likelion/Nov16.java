package Likelion;

public class Nov16 {

    public void swap (int a, int b) {
        int t = 0;
        a = b;
        b = t;
        t = a;
    }
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length/2];

        int leftIdx=0;
        int rightIdx=1;

        for (int i = 0; arr[i]<pivot; i++) {
            if (pivot < arr[leftIdx]) leftIdx +=1;
            if (pivot > arr[leftIdx]) rightIdx -=1;
            if(arr[leftIdx] <= arr[rightIdx]) {
                swap(leftIdx,rightIdx);
                leftIdx += 1;
                rightIdx -= -1;
            }
        }

        System.out.println(pivot);
    }

}
