package SetByAnudip;
import java.util.Scanner;
import java.util.*;

public class MapEx3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lmp= new LinkedHashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Initial list of elements: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Enter the key:");
            int key=sc.nextInt();
            System.out.println("Enter the value of HashMap:");
            String  value=sc.next();
            lmp.put(key,value);

        }
        System.out.println("After invoking put() method ");
        for(Map.Entry m:lmp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
//        lmp.putIfAbsent(103, "Gaurav");
//        System.out.println("After invoking putIfAbsent() method ");
//        for(Map.Entry m:lmp.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//        HashMap<Integer,String> map=new HashMap<Integer,String>();
//        map.put(104,"Ravi");
//        map.putAll(lmp);
//        System.out.println("After invoking putAll() method ");
//        for(Map.Entry m:map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    }
}
