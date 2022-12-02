package Likelion.Nov;

public class Nov16 {

    public static void swap(int a, int b) {
        int t = 0;
        a = b;
        b = t;
        t = a;
    }
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length/2];
        System.out.println(pivot);
        int leftIdx=0;
        int rightIdx=1;

        while(pivot > arr[leftIdx]) leftIdx +=1;
        while(pivot < arr[leftIdx]) rightIdx -=1;
        if(arr[leftIdx] <= arr[rightIdx]) {
        swap(leftIdx,rightIdx);
                leftIdx += 1;
                rightIdx -= -1;
            }
        }
    }
