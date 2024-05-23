package Condition4;
import java.util.Scanner;
public class Area_or_peri {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the length");
         int length=sc.nextInt();
        System.out.println("Enter the length");
        int breadth=sc.nextInt();
        int area=(length*breadth);
        int perimeter=2*(length+breadth);
        if(area>perimeter){
            System.out.println("Area is greater than perimeter :");
        }
        else if(area==perimeter){
            System.out.println("Area is equal to  perimeter :");

        }
        else{
            System.out.println("Area is less  than perimeter :");
        }
    }

}
