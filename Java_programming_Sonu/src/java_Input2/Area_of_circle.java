package java_Input2;
import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of Radius is: ");
      int Radius=sc.nextInt();
      double pi=3.14;
      double Area=pi*Radius*Radius;
        System.out.println("The Area of Circle is : " +Area);
    }
}
