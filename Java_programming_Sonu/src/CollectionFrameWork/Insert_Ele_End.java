package CollectionFrameWork;
import java.util.LinkedList;
import java.util.Scanner;
class Inserts{
    public static void AddEleEnd(LinkedList<Integer>ll,int n,int ele){
        LinkedList<Integer>ll1= new LinkedList<>(ll);
         ll1.add(n,ele);
         System.out.println(ll1);
    }
    void Display(LinkedList<Integer>ll){
        for(int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
    }
}
public class Insert_Ele_End {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Inserts in=new Inserts();
        System.out.println("Enter the Size Of LinkedList:");
        int n=sc.nextInt();
        LinkedList<Integer>ll= new LinkedList<>();
        System.out.println("Enter The Value Of LinkedList:");
        for(int i=0; i<n; i++){
            ll.add(sc.nextInt());
        }
        System.out.println("The Initial value of LinkedList:");
        in.Display(ll);
        System.out.println("Enter The Element You Want To Insert:");
        int ele=sc.nextInt();
        System.out.println("The New Value of LinkedList:");
        in.AddEleEnd(ll,n,ele);
    }
}
