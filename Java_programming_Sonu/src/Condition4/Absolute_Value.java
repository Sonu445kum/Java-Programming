package Condition4;
import java.util.Scanner;
public class Absolute_Value {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer value");
        int n=sc.nextInt();
        if(n<0){
            n=n*(-1);
        }
        System.out.println("The Absolute Value is :" + n);

    }
}
