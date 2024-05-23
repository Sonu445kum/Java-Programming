package SetByAnudip;
import java.util.Map;
import java.util.Scanner;

import java.util.TreeMap;

public class MapEx4 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of HashMap:");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Enter the key:");
            int key=sc.nextInt();
            System.out.println("Enter the value of HashMap:");
            String  value=sc.next();
            map.put(key,value);

        }
        System.out.println("Iterating HashMap:");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+""+" "+ m.getValue());
        }
        System.out.println("Initial list of elements: "+map);
        //key-based removal
        map.remove(100);
        System.out.println("Updated list of elements: "+map);
        //value-based removal
        map.remove(101);
        System.out.println("Updated list of elements: "+map);
        //key-value pair based removal
        map.remove(102, "Rahul");

    }
}
