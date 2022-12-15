package basics.binarySearch;

//while문, pl<=pr 대신 pr-pl>=0 수식을 활용
public class BinSearch2 {
    
    //입력받은 상태에서 시작
    int[] arr = {1,2,3,5,7,9,11,15};
    int k = 11; //11이 몇 번째인지 탐색

    public int solve(int s, int e) { //s=맨 처음, e=맨 끝
        int m;
        while (e-s >= 0) { //e-s>=0 == e>=s
            m = (s+e) / 2;
            if(arr[m]==k) return m+1;
            if(arr[m]<k) s=m+1;
            else e=m-1;
        }
        return -1;
    }
    
}
