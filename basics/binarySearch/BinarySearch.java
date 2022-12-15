package basics.binarySearch;

//이분탐색 구현. keypoint: 인덱싱
public class BinarySearch {
    //인덱스값이 n인 배열 a에서 key와 같은 요소 이분탐색
    public static int binarySearch(int[] a, int n, int key) {
        int pl = 0; //검색 시작 범위
        int pr = n - 1; //검색 끝 범위

        do {
            int pc = (pl+pr)/2;
            if (a[pc] == key) return pc;
            else if (a[pc] < key){
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1; //검색 실패 = 검색 범위가 더 이상 없는 경우
    }
}

