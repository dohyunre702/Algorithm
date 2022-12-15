package basics.queue;

//int형 큐 (링 버퍼로 배열 요소를 앞쪽으로 옮기지 않는 큐를 구현한다.)
public class IntQueue {

    /* int형 링 버퍼 큐 구현 */
    private int max; //큐의 용량
    private int front; //'논리적으로' 큐의 맨 앞 요소 (꼭 인덱스값이 0이어야 하는 것 아님)
    private int rear; //'논리적으로' 큐의 마지막 요소
    private int num; //큐의 현재 데이터 수
    private int[] que; //큐 본체를 참조하는 배열 변수

    //실행 시 예외: 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    //실행 시 예외: queue가 가득 참
    public class OverflowIntQueueExcpetion extends RuntimeException {
        public OverflowIntQueueExcpetion() {
        }
    }

    //생성자 (큐 본체 생성)
    public IntQueue(int capacity) {
        num = front = rear = 0; //비어있는 상태 (단순히 front=rear면 비어있는지 가득 찼는지 알 수 x)
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    /* 메서드 구현 */
    //enque
    public int enque(int x) throws OverflowIntQueueExcpetion {
        if (num >= max) throw new OverflowIntQueueExcpetion();
        que[rear++] = x;
        num++;
        if (rear == max) rear = 0; //큐가 가득 차게 되었을 경우 rear을 초기화해 다음 값이 다시 que[0]에 저장되도록 함
        return x;
    }

    //deque
    public int deque(int x) throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException();
        x = que[front++];
        num--;
        if (front == max) front = 0; //인덱스 초과 문제 > front를 0으로 변환
        return x;
    }

    //peek : 프런트 데이터 들여다봄
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException();
        return que[front];
    }

    //검색
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) { //front > rear로 검색 수행
            int idx = (i+front) % max; //물리적 0이 아닌 front값부터 search
            if(que[idx] == x) return idx;
        }
        return -1;
    }

    //clear, capacity, size, isEmpty, isFull : IntAryQueue와 동일
    //dump front -> rear 순으로 출력
    public void dump() {
        if(num <= 0) System.out.println("큐가 비어있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.println(que[(i+front)%max] + " ");
            System.out.println();
        }
    }
}
