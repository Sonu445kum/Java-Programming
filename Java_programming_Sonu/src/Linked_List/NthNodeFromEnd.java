//package Linked_List;
//
//public class NthNodeFromEnd {
//    public static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//        }
//    }
////    public static Node NthNode(Node head,int idx){
////        int size=0;
////        Node temp=head;
////        while(temp!=null){
////            size++;
////            temp=temp.next;
////        }
////        int totalNode=size-idx+1;
////        temp=head;
////        for(int i=1; i<=totalNode-1; i++){
////            temp=temp.next;
////        }
////        return temp;
////    }
//    public static Node NthNode(Node head,int idx){
//        Node Slow=head;
//        Node Fast=head;
//        for(int i=1; i<=idx; i++){
//            Fast=Fast.next;
//        }
//        while(Fast!=null){
//            Slow=Slow.next;
//            Fast=Fast.next;
//        }
//        return Slow;
//    }
//    public static Node DeleteNthFromEnd(Node head,int idx){
//        Node Slow=head;
//        Node Fast=head;
//        for(int i=1; i<=idx; i++){
//            Fast=Fast.next;
//        }
//        if(Fast==null){
//            head=head.next;
//            return head;
//        }
//        while(Fast.next!=null){
//            Slow=Slow.next;
//            Fast=Fast.next;
//        }
//        Slow.next=Slow.next.next;
//        return head;
//    }
//  public static   void Display(Node head){
//      Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//      System.out.println();
//    }
//    public static void main(String[] args) {
//        Node a=new Node(10);
//        Node b=new Node(20);
//        Node c=new Node(30);
//        Node d=new Node(40);
//        Node e=new Node(50);
//        Node f=new Node(60);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=f;
////        Node ans=NthNode(a,3);
////        System.out.println("The Nth Node From End:"+ans.data);
//       a=DeleteNthFromEnd(a,6);
//        Display(a);
//    }
//}
