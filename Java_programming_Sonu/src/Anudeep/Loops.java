package Anudeep;
import java.util.Scanner;
class Perfect{
    static void CheckPerfect(int n){
        int original=n;
        int sum=0;
        for(int i=1; i<original; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(original==sum){
            System.out.println("This is Perfect Number:");
        }
        else{
            System.out.println("This is Not Perfect Number:");
        }
    }
}
class Armstrong{
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
    }
class Pattern{
    static void Triangle(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
public class Loops {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Pattern obj=new Pattern();
        Armstrong Asn= new Armstrong();
        Perfect pn=new Perfect();
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
       // System.out.println("The half_Triangle is:");
       // obj.Triangle(n);
       // Asn.CheckArms(n);
        pn.CheckPerfect(n);



    }
}
