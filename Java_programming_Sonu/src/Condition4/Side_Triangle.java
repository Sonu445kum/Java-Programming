package Condition4;
import java.util.Scanner;
public class Side_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side ");
        int a= sc.nextInt();
        System.out.println("Enter the Second side ");
        int b= sc.nextInt();
        System.out.println("Enter the third side ");
        int c= sc.nextInt();
        if((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.println(" the triangle is valid");
        }
        else{
            System.out.println(" the triangle is not  valid");
        }

    }
}
