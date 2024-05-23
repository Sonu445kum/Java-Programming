package Condition4;
import java.util.Scanner;
public class three_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        if(n>100 && n<1000){
            System.out.println(" The Number is three digit ");
        }
        else{
            System.out.println(" The Number is not  three digit ");
        }
    }
}
