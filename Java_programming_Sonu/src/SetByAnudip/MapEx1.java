package SetByAnudip;
import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of HashMap:");
        int n=sc.nextInt();

        System.out.println("Initial list of elements: "+hm);
        for(int i=1; i<=n; i++){
            System.out.println("Enter the key:");
            int key=sc.nextInt();
            System.out.println("Enter the value of HashMap:");
            int v=sc.nextInt();
            hm.put(key,v);
        }
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+""+" "+ m.getValue());
        }



    }
}
