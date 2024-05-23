package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Scanner;
class Insert{
    public static void   AddElement(ArrayList<Integer> al,int n,int ele,int pos){
        ArrayList<Integer> al1=new ArrayList<>(al);
        al1.add(pos,ele);
        System.out.println(al1);
    }
    void Display(ArrayList<Integer> al){
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
    }

}
public class Insert_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of ArrayList:");
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println("Enter The Value Of ArrayList:");
        for(int i=0; i<n; i++){
            al.add(sc.nextInt());
        }
        Insert i=new Insert();
        System.out.println("The Initial  value of ArrayList:");
        i.Display(al);
        System.out.println("Enter The Element You Want To Insert:");
        int ele=sc.nextInt();
        System.out.println("Enter The Position Where You Want To Insert:");
        int pos=sc.nextInt();
        System.out.println("The New Value Of ArrayList At Inserted At:"+pos);
        i.AddElement(al,n,ele,pos);




    }
}
