package Array;

import java.util.ArrayList;
import java.util.Collections;
public class ArraysList_Question {
//    static void ReverseArrayList(ArrayList<Integer> list){
//        int i=0,j=list.size()-1;
//        while(i<j){
//            Integer temp= Integer.valueOf(list.get(i));
//            list.set(i, list.get(j));
//            list.set(j, temp);
//            i++;j--;
//        }
//    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(" Original Arrays List :"+list);
       // ReverseArrayList(list);
        Collections.reverse(list);// this is inbuilt method in collections frame Works in java library;
        System.out.println(" Reverse  Arrays List :"+list);
        Collections.sort(list);
        System.out.println(" Ascending order:"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(" Descending order:"+list);
        // Sort The String in The Arrays List:
        ArrayList<String>l1=new ArrayList<String>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("India");
        l1.add("In");
        l1.add("America");
        System.out.println(" Original Arrays List :"+l1);
        Collections.sort(l1);
        System.out.println(" Sorted String Arrays List :"+l1);


    }
}
