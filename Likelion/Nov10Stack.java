package Likelion;
import java.util.Stack;

//같은 숫자는 싫어 stack 사용
public class Nov10Stack {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] != st.peek()) {
                st.push(arr[i]);
            }
        }

        int[] answer = new int[st.size()];

        //거꾸로 꺼내기
        for (int i = st.size() -1; i >= 0; i++) {
            answer[i] = st.pop();
        }
        return answer;
    }
}
