package java_Input2;
import java.util.Scanner;
public class Find_Rem {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Dividend is :");
        int a=sc.nextInt();
        System.out.println("Enter Your Divisor is : ");
        int b=sc.nextInt();
        int Q=a/b;
        int Rem=a-(b*Q);
        System.out.println("The Remainder of Given Number is :"+ Rem);

    }
}
