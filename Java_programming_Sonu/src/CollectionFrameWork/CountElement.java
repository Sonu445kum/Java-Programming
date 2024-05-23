package CollectionFrameWork;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
class FindsEle{
    public static int  Count( TreeSet<Integer>ts,int n){
        int cnt=0;
        Iterator<Integer> itr= ts.iterator();
        while(itr.hasNext()){
           if(itr.next()<200)
            cnt++;
        }
        return cnt;
    }

}
public class CountElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TreeSet<Integer>ts=new TreeSet<>();
        System.out.println("Enter The Size of TreeSet:");
        int n=sc.nextInt();
        System.out.println("Enter The Value of TreeSet:");
        for(int i=0; i<n; i++){
            ts.add(sc.nextInt());
        }
        System.out.println("The Initial Value Of TreeSet:");
        for(int v:ts){
            System.out.print(v+" ");
        }
        System.out.println();
        FindsEle f=new FindsEle();
        System.out.println("The Total value of TreeSet Which Less than 200:"+f.Count(ts,n));




    }
}
