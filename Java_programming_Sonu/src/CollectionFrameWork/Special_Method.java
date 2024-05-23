package CollectionFrameWork;
import java.util.Collections;
import java.util.ArrayList;

public class Special_Method {
    public static void main(String[] args) {
        ArrayList<Integer>al= new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(5);
        al.add(5);
        // Sorted Method:
        Collections.sort(al);
        System.out.println("The Sorted Element:");
        System.out.println(al);
        // Reverse Method;
        System.out.println("The Reverse Order:");
        Collections.reverse(al);
        System.out.println(al);
        // Binary Search Method:
        System.out.println(Collections.binarySearch(al,8));
        // Frequency Method:
        System.out.println("The frequency of ArrayList:");
        System.out.println(Collections.frequency(al,5));
        // Copy Method:
        ArrayList<Integer>al1= new ArrayList<>(al);
        System.out.println("Copy Method:");
        System.out.println(al1);

    }
}
