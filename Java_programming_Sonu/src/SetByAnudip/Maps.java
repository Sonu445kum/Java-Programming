package SetByAnudip;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<Integer,String>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of HashMap:");
        int n=sc.nextInt();
       for(int i=0; i<n; i++){
           System.out.println("Enter the key:");
           int key=sc.nextInt();
           System.out.println("Enter the value of HashMap:");
           int  value=sc.nextInt();
           map.put(key, String.valueOf(value));
       }
       // traversal for loop
//        for(int i=0; i<n; i++){
//            int ans= Integer.parseInt(map.get(+5);
//            System.out.println();
//        }
        System.out.println("Iterating HashMap:");
      for(Map.Entry m:map.entrySet()){
          System.out.println(m.getKey()+""+" "+ m.getValue());
      }
    }
}
