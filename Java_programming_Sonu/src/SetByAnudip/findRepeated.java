package SetByAnudip;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.HashSet;
public class findRepeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for HashSet1:");
        int n1=sc.nextInt();
        HashSet<Integer>hs= new HashSet<>();
        System.out.println("Adding the element into HashSet:");
        for(int i=0; i<n1; i++){
            hs.add(sc.nextInt());
        }
        System.out.println("The value of HashSet1:");
        for(int k: hs){
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println("Enter the size for HashSet2:");
        int n2=sc.nextInt();
        HashSet<Integer>Hs= new HashSet<>();
        System.out.println("Adding the element into HashSet2:");
        for(int i=0; i<n2; i++){
            Hs.add(sc.nextInt());
        }
        System.out.println("The value of HashSet2:");
        for(int k: Hs){
            System.out.print(k+" ");
        }
        System.out.println();
       LinkedHashSet<Integer>lh= new LinkedHashSet<>();
       for(int i:hs){
           for(int j:Hs){
               if(i==j){
                   lh.add(i);
               }
           }
       }
        Iterator<Integer>itr=lh.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }


    }

}
