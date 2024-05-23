package SetByAnudip;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedHashSet<Integer> arr=new LinkedHashSet<>();
        System.out.println("Enter the No of Elements:");
        int n=sc.nextInt();
        System.out.println("Enter the value:");
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println("The value of Linked Set:");
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
        System.out.println("Size of linked Set:"+cnt);
    }

}
