package AnudipAssignment;
import java.util.Scanner;
public class Rev_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        System.out.println("The Reverse Triangle :");
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

    }
}
