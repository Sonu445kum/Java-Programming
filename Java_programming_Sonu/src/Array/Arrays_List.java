package Array;
import java.sql.Array;
import java.util.ArrayList;
public class Arrays_List {
    public static void main(String[] args){
       ArrayList<Integer> l1=new ArrayList<Integer>();
       // Add New Element;
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        // Get an element at index i;
        System.out.println(" print element with single or individual:");
        System.out.print(l1.get(0)+" ");//10;
        System.out.print(l1.get(1)+" ");// 20;
        System.out.print(l1.get(2)+" ");// 30;
        System.out.println(l1.get(3)+" ");// 40;
        // print element with loops
        System.out.println(" print element with loops:");
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");//10,20,30,40;
        }
        System.out.println();
        System.out.println(" print element with directly:");
        System.out.println(l1);//[10,20,30,40];
        // Adding some Element at index i:
        System.out.println("Adding some Element at index i:");
        l1.add(1,200);
        System.out.println(l1);//[10,200,20,30,40];
        // modify element at index i;
        l1.set(1,500);
        System.out.println(" modify element at index i:");
        System.out.println(l1);//[10,500,20,30,40];
        // Remove Some Element at index i:
        System.out.println("Remove Some Element at index i:");
        l1.remove(1);
        System.out.println(l1);
        // Remove element from list:
        System.out.println("Remove element from list:");
        System.out.println(Integer.valueOf(20));
        l1.remove(Integer.valueOf(20));
        System.out.println(l1);
        // checking an element are present or not:
        boolean ans=l1.contains(Integer.valueOf(10));
        System.out.println(ans);
        // if you don`t specify class you can put anything inside class:
        ArrayList l2=new ArrayList();
        l2.add("Sonu");
        l2.add('c');
        l2.add(2);
        System.out.println(l2);
    }
}
