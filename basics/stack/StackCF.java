package basics.stack;

import java.util.Stack;

//컬렉션프레임워크 사용
public class StackCF {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("0");
        st.push("1");
        st.push("2");
        st.push("3");

        System.out.println("=Stack=");
        while(!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
