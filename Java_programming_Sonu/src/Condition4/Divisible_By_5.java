package Condition4;
import java.util.Scanner;
public class Divisible_By_5 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("The Number is divisible by 5:");
        }
        else{
            System.out.println("The Number is not divisible by 5:");
        }
    }
}
