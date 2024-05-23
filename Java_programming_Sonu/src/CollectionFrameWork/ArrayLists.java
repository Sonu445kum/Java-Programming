package CollectionFrameWork;
import  java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);
        l1.add(90);
        // 1-> print element with normal loops;
        System.out.println("The Normal loops:");
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        System.out.println("The Value of ArrayList:");
        // 2-> print elements with  Enhance loop;
        for(int val:l1){
            System.out.print(val+" ");
        }
        System.out.println();

        System.out.println("The Size of ArrayList:"+l1.size());
        // 3-> set value in ArrayList;
        System.out.println("The New Value of ArrayList:");
        l1.set(1,200);
        for(int val:l1){
            System.out.print(val+" ");
        }
        System.out.println();

        System.out.println("The Size of ArrayList:"+l1.size());
        // 4-> Remove value from Arraylist;
        l1.remove(8);
        for(int val:l1){
            System.out.print(val+" ");
        }
        System.out.println();
        // 5-> find the size of ArrayList;
        System.out.println("The Size of ArrayList:"+l1.size());
        // 6->contains;
        System.out.println( l1.contains(3));
        System.out.println(l1.contains(200));
        // 7-> check isEmpty();
        System.out.println(l1.isEmpty());
        // 8-> find the value from index:
        System.out.println("The new value of ArrayList:");
        l1.remove(Integer.valueOf(80));
        l1.remove(Integer.valueOf(70));
        System.out.println(l1);
        ArrayList<Integer>al= new ArrayList<>();
        al.add(10);
        al.add(20);
        // 8-> this is clear method:
        al.clear();
        System.out.println("The total element:"+al);
        al.add(30);
        al.add(1);
        al.add(2);
        System.out.println(al);
        Iterator itr=al.iterator();
        System.out.println("print with iterable");
        while(itr.hasNext()){
            int x=(Integer)itr.next();
            if(x<10)
                itr.remove();
        }
        System.out.println(al);
        al.removeAll(al);
        System.out.println(al);
        System.out.println("The size of ArrayList:"+al.size());
    }
}
