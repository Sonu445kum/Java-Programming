package AnudipAssignment;
import java.util.*;
public class Armstrong {
    static void PrintArmsRange(int n){
        int  originalNumber, remainder, result = 0;

        originalNumber = n;
        for(int i=10; i<1000; i++){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

    static void CheckArms(int n){

        int  originalNumber, remainder, result = 0;

        originalNumber = n;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the Number:");
       int n=sc.nextInt();
      // CheckArms(n);
       PrintArmsRange(n);
    }
}
