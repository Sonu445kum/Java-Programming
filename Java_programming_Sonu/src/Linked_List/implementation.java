//package Linked_List;
//
//public class implementation {
//   public static class Node{
//       int data;
//       Node next;
//       Node(int data){
//           this.data=data;
//       }
//   }
//   public static class Linked_List{
//       Node head=null;
//       Node tail=null;
//       void InsertAtEnd(int val){
//        Node temp=new Node(val);
//        if(head==null){
//            head=temp;
//            tail=temp;
//        }
//        else{
//            tail.next=temp;
//            tail=temp;
//        }
//        tail=temp;
//       }
//       void InsertAtHead(int val){
//           Node temp=new Node(val);
//           // for Empty Case;
//           if(head==null){
//               head=temp;
//               tail=temp;
//           }
//           // for Non-empty Case;
//           else{
//               temp.next=head;
//               head=temp;
//           }
//       }
//       void InsertAtIndex(int idx,int val){
//           Node t=new Node(val);
//           Node temp=head;
//           // if index==0;
//           if(idx==0){
//               InsertAtHead(val);
//               return;
//           }
//           // if idx== Size();
//           else if(idx==Size()){
//              InsertAtEnd(val);
//              return;
//           }
//           for(int i=1; i<=idx-1; i++){
//               temp=temp.next;
//           }
//           t.next=temp.next;
//           temp.next=t;
//       }
//       void DeleteAtIndex(int idx){
//           if(idx==0){
//              head=head.next;
//              return;
//           }
//           Node temp=head;
//           for(int i=1; i<=idx-1; i++){
//               temp=temp.next;
//           }
//           temp.next=temp.next.next;
//           tail=temp;
//       }
//       void Display(){
//           Node temp=head;
//           while(temp!=null){
//               System.out.print(temp.data+"->");
//               temp=temp.next;
//           }
//       }
//       int  Size(){
//           int count=0;
//           Node temp=head;
//           while(temp!=null){
//               count++;
//               temp=temp.next;
//           }
//           return count;
//       }
//   }
//    public static void main(String[] args) {
//        Linked_List ll= new Linked_List();
//        ll.InsertAtEnd(50);
//        ll.InsertAtEnd(40);
//        ll.InsertAtEnd(30);
//        ll.InsertAtEnd(20);
//        ll.InsertAtHead(200);
//        ll.InsertAtHead(400);
//        ll.InsertAtHead(600);
//        ll.InsertAtHead(800);
//        System.out.println("The Linked List are:");
//        ll.Display();
//        System.out.println();
//        System.out.println("The Size Of Linked List Are:"+ll.Size());
//        System.out.println("The New Linked List:");
//        ll.InsertAtIndex(0,500);
//        ll.Display();
//        System.out.println();
//        System.out.println("The Size Of Linked List Are:"+ll.Size());
//        ll.DeleteAtIndex(0);
//        ll.Display();
//        System.out.println();
//        System.out.println("The Size Of Linked List Are:"+ll.Size());
//        System.out.println(ll.head.data);
//        System.out.println(ll.tail.data);
//
//    }
//}
