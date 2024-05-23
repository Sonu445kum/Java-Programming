package Anudeep;
import java.util.Scanner;
class Operation{
    static void Test(int n){
        if(n%2==0 && n%3==0){
            System.out.println(" The Number is Divisible by 2 and 3:"+n);
        }
        else{
            System.out.println(" Not Divisible");
        }

    }
    static void Area(int n){
        System.out.println("Area of Square:"+ n*n);
    }
    static void Perimeter(int n){
        System.out.println("Perimeter of Square:"+ 4*n);
    }
}
public class Calculate {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the Number:");
     int n= sc.nextInt();
     Operation obj=new Operation();
   //  obj.Perimeter(n);
   //  obj.Area(n);
     obj.Test(n);


    }
}
