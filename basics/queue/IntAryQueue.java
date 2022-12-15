package basics.queue;

//배열로 큐 구현하기
public class IntAryQueue {
    /* int형 queue 구현 */
    private int max; //큐 용량
    private int num; //현재 데이터 수
    private int[] que; //큐 본체

    //실행 시 예외: queue가 비어있음
    public class EmptyIntQueException extends RuntimeException {
        public EmptyIntQueException() {
        }
    }

    //실행 시 예외: queue가 가득 참
    public class OverflowQueExcpetion extends RuntimeException {
        public OverflowQueExcpetion() {
        }
    }

    //생성자. 큐 초기화
    public IntAryQueue(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max]; //큐 본체용 배열 생성
        } catch (OutOfMemoryError e) {//생성불가
            max = 0;
        }
    }

    /* 메서드 구현 */
    //inqueue (push)
    public int push(int x) throws OverflowQueExcpetion {
        if (num >= max) throw new OverflowQueExcpetion();
        return que[num++] = x;
    }

    //dequeue (pop). 값 제거
    public int pop() throws EmptyIntQueException {
        if(num <= 0) throw new EmptyIntQueException();
        int x = que[0]; //que의 front값 대입
        for(int i = 1; i <= num; i++) { //나머지 인덱스 한 칸씩 당기기
            que[i-1] = que[i];
        }
        return x; //기존의 que[0]값 반환
    }

    //peek. 값만 반환
    public int peek() throws EmptyIntQueException {
        if(num <= 0) throw new EmptyIntQueException();
        return que[0];
    }

    //indexOf: 검색
    public int indexOf(int x) {
        for(int i = 0; i < num; i++) { //바닥부터 선형검색
            if(que[i] == x) return i; //성공
        }
        return -1; //실패
    }

    //clear: 큐 비우기
    public void clear() {
        num = 0;
    }

    //capacity: 용량 반환
    public int capacity() {
        return max;
    }
    //size: 데이터 수 확인
    public int size() {
        return num;
    }

    //isEmpty: 큐 비어있는지 검사
    public boolean isEmpty() {
        return num <= 0;
    }

    //isFull: 큐 가득 찼는지 검사
    public boolean isFull() {
        return num >= max;
    }

    //dump: 큐 안의 모든 데이터를 앞에서부터 출력
    public void dump() {
        if (num <= 0) System.out.println("큐가 비어있습니다.");
        else {
            for (int i = 0; i < num; i++) {
                System.out.println(que[i] + " ");
                System.out.println();
            }
        }
    }

}
