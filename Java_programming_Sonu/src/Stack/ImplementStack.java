package Stack;

import java.util.Stack;
class Stacks{
    private int[] arr=new int[5];
    private int idx=0;
    void push(int x){
        arr[idx]=x;
        idx++;
    }
    int peek(){
        if(idx==0){
            System.out.println("Stack is Empty:");
            return -1;
        }
        return arr[idx-1];

    }
    int pop(){
        if(idx==0){
            System.out.println("Stack is Empty:");
            return -1;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return  top;
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0)return  true;
        else{
            return false;
        }
    }
    boolean isFull(){
        if(idx==arr.length) return  true;
        else{
            return false;
        }
    }
    void Display(){
        for(int i=0; i<=idx-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class ImplementStack {
    public static void main(String[] args) {
        Stacks st =new Stacks();
        st.push(1);
        st.Display();
        st.push(2);
        st.Display();
        st.push(3);
        st.Display();
        st.push(4);
        st.Display();
        st.push(5);
        st.Display();
        System.out.println("Stack isFull:"+st.isFull());
        System.out.println("Size Of Stack:"+st.size());
        st.pop();
        st.Display();
        st.pop();
        st.Display();
        System.out.println(st.peek());
        System.out.println("Size Of Stack:"+st.size());
        st.Display();
        st.pop();
        System.out.println(st.peek());
        st.Display();
        st.pop();
        System.out.println(st.peek());
        st.Display();
        st.pop();
        System.out.println(st.peek());
        st.Display();
        System.out.println("Stack isFull:"+st.isFull());
        st.pop();
        System.out.println("Stack isEmpty:"+st.isEmpty());
    }
}
