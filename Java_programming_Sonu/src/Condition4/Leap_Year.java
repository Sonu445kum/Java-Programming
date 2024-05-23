package Condition4;
import java.util.Scanner;
public class Leap_Year {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int n=sc.nextInt();
        isLeap(n);

    }
}
