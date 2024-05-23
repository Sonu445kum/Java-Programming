package Stack;
public class LLImplementStack {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public  static class LLStack {
       private Node head = null;
      private   int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
            }
            System.out.println();
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty:");
                return -1;
            }
            return head.val;

        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty:");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int size() {
            return size;
        }
    }

    public void main(String[] args) {
        LLStack st = new LLStack();
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
        System.out.println("Size Of Stack:" + st.size());
        st.pop();
        st.Display();
        st.pop();
        st.Display();
        System.out.println(st.peek());
        System.out.println("Size Of Stack:" + st.size());
        st.Display();
        st.pop();
        System.out.println(st.peek());
        st.Display();
        st.pop();
    }
}

