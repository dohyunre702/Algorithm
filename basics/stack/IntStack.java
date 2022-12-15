package basics.stack;
public class IntStack {
    /* int형 stack 구현하기 */
    int max; //스택 용량(스택 최대 데이터 수)
    int pointer; //포인터(스택에 쌓여있는 데이터 수)
    int[] stk; //스택 본체

    //실행 시 예외: 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    //실행 시 예외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    //생성자
    public IntStack(int capacity) {
        pointer = 0;
        max = capacity;
        try {
            stk = new int[max]; //스택 본체용 배열 생성
        } catch (OutOfMemoryError e) { //생성 불가
            max = 0;
        }
    }

    /* 메서드 구현 */
    //push
    public int push(int x) throws OverflowIntStackException {
        if (pointer >= max) throw new OverflowIntStackException();
        return stk[pointer++] = x;
    }

    //pop
    public int pop(int x) throws EmptyIntStackException {
        if (pointer <= 0) throw new EmptyIntStackException();
        return stk[--pointer];
    }

    //peek
    public int peek(int x) throws EmptyIntStackException {
        if (pointer <= 0) throw new EmptyIntStackException();
        return stk[pointer--];
    }

    //indexOf: 검색
    public int indexOf(int x) {
        for (int i = pointer - 1; i >= 0; i--) { //정상 쪽에서 선형검색
            if (stk[i] == x) return i; //성공
        }
        return -1; //실패
    }

    //clear: 스택 비우기
    public void clear() {
        pointer = 0;
    }

    //capacity: 용량 반환
    public int capacity() {
        return max;
    }

    //size: 데이터 수 확인
    public int size() {
        return pointer;
    }

    //isEmpty: 스택이 비어있는지 검사
    public boolean isEmpty() {
        return pointer <= 0;
    }

    //isFull: 스택이 가득 찼는지 검사
    public boolean isFull() {
        return pointer >= max;
    }

    //dump: 스택 안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
    public void dump() {
        if (pointer <= 0) System.out.println("스택이 비어있습니다.");
        else {
            for (int i = 0; i < pointer; i++) {
                System.out.print(stk[i] + " ");
                System.out.println();
            }
        }
    }
}