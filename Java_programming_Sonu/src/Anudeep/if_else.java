package Anudeep;
import java.util.Scanner;
class LeapYear {
    static void isLeap(int y) {
        if ((y % 100) == 0) {
            if ((y % 400) == 0 ) {
                System.out.println("leap year");
            } else {
                System.out.println(" not a leap year");
            }
        }
        else if(y%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println(" not a leap year");
        }
    }
}
class CheckCondition{
   static   void Check(int a){
        if((a > 5) && (a < 20)){
            System.out.println("the number is greater than 5:");
        }
        else if(( a > 20) && (a < 30)){
            System.out.println("the number is greater than 20 and less than 30:");
        }
        else if(( a > 30) && (a < 40)){
            System.out.println(" the number is greater than 30  and less than 40:");
        }
        else{
            System.out.println(" The number is greater than is 40:");
        }
    }
}
public class if_else {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
       // CheckCondition obj=new CheckCondition();
      //  obj.Check(n);
        LeapYear obj1=new LeapYear();
        obj1.isLeap(n);


    }
}

