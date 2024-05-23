package SetByAnudip;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashSet<Integer>arr=new HashSet<>();
        System.out.println("Enter the No of Elements:");
        int n=sc.nextInt();
        System.out.println("Enter the value:");
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println("The value of Hash Set:");
        for(int v:arr){
            System.out.print(v+" ");
        }
        System.out.println();
            int cnt=0;
            Iterator<Integer> itr= arr.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
                cnt++;
            }
        System.out.println("Size of hash Set:"+cnt);
    }
}
