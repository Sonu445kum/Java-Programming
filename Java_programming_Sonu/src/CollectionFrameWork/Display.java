package CollectionFrameWork;
import java.util.Scanner;
import java.util.ArrayList;
public class Display {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>al= new ArrayList<>();
        System.out.println("Enter the size of Elements:");
        int size=sc.nextInt();
        System.out.println("Enter the value of An ArrayList:");
        for(int i=0; i<size; i++){
            al.add(sc.nextInt());
        }
        System.out.println("The value of An ArrayList:");
        for(int v: al){
            System.out.print(v+" ");
        }
        System.out.println();
    }
}
