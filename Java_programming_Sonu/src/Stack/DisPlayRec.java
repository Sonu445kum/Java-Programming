package Stack;

import java.util.Stack;
class Reverse{
    public static void DisplayRev(Stack<Integer>st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        System.out.print(top+" ");
        DisplayRev(st);

        st.push(top);
    }
    public static void Display(Stack<Integer>st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        Display(st);
        System.out.print(top+" ");
        st.push(top);
    }
}
public class DisPlayRec {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Reverse re=new Reverse();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Display Normal Flow of  Stack:");
        re.Display(st);
        System.out.println();
        System.out.println("Reverse Order:");
       re.DisplayRev(st);
    }
}
