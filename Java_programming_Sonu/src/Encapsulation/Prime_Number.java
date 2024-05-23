package Encapsulation;
import java.util.Scanner;
class Find{
     static boolean  isPrime(int n) {
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number:");
        int num=sc.nextInt();
        Find f=new Find();
        if(f.isPrime(num)==true){
            System.out.println("This  is a Prime Number:");
        }
        else{
            System.out.println("This  is a Not Prime Number :");
        }
    }
}
