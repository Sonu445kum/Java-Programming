package Stack;

import java.util.Stack;

public class BasicStackQues {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        System.out.println("Size Of Stack:"+st.size());
        st.push(20);
        System.out.println("Size Of Stack:"+st.size());
        st.push(30);
        System.out.println("Size Of Stack:"+st.size());
        st.push(40);
        System.out.println("Size Of Stack:"+st.size());
        st.push(50);
        System.out.println(st);
        System.out.println("Size Of Stack:"+st.size());
        System.out.println("Peek Of Stack:"+st.peek());
        System.out.println("Pop of Stack:"+st.pop());
        System.out.println(st);

    }
}
