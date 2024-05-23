package AnudipAssignment;
import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Message:");
        String str=sc.nextLine();
        System.out.println("Welcome:"+str);
    }
}
