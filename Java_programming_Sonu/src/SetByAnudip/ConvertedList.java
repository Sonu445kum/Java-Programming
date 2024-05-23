package SetByAnudip;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class ConvertedList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of List:");
        int n=sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        // adding elements to ArrayList object
        System.out.println("Enter the value of List:");
        for(int i=0; i<n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("The value of ArrayList:");
        for(int v:al) {
            System.out.print(v+" ");
        }
        System.out.println();
        // pass ArrayList value  into the HashSet

        HashSet<Integer> hashSet = new HashSet<>(al);

        // printing every element in HashSet
        System.out.println("The value of HashSet:");
        for (int  value : hashSet) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
    }

