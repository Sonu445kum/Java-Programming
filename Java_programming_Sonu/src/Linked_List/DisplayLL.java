package Linked_List;

public class DisplayLL {
// find the length of linked list;
    public static int Length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    // Display Linked List With Recursive;

    public static void DisPlay(Node head){
        if(head==null)return;
        System.out.print(head.data+"->");
        DisPlay(head.next);
    }
     // Display Reverse Linked List With Recursive;
     public static void DisPlayRev(Node head){
         if(head==null)return;
         DisPlayRev(head.next);
         System.out.print(head.data+"->");
     }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        DisPlay(a);
        System.out.println();
        System.out.println("Reverse Linked List:");
        DisPlayRev(a);
        System.out.println();
        System.out.println("Length of Lined List:"+Length(a));

    }
}
