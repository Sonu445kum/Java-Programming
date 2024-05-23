package Condition4;
import java.util.Scanner;
public class div_3_or_5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println(" The Number is divisible by 5 and 3");
        }
        else{
            System.out.println(" The Number is not  divisible by 5 and 3");
        }
    }
}
