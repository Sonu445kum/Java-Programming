package java_Input2;
import java.util.Scanner;
public class Square_Root {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value of x is: ");
        int x=sc.nextInt();
        int y=x*x;
        System.out.println("The Square Root of Number is :" + y);
    }
}
