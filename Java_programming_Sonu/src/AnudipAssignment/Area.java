package AnudipAssignment;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("yes:");
        System.out.println("Enter the Radius:");
        int r=sc.nextInt();
        double pi=3.14;
        double Area= (int) (pi*(r*r));
        System.out.println("Area:"+Area);

    }
}
