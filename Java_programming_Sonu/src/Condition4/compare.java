package Condition4;
import java.util.Scanner;
public class compare {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter first Number is :");
         int a=sc.nextInt();
         System.out.println("Enter Second Number is :");
         int b= sc.nextInt();
         System.out.println("Enter third Number is :");
         int c=sc.nextInt();
         if(a>b && a>c){
             System.out.println("the greatest no is: "+ a);
         }
         else if(b>a && b>c){
             System.out.println("the greatest no is: "+ b);
         }
         else{
             System.out.println("the greatest no is: "+ c);
         }

    }
}
