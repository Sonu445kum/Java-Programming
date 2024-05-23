package AnudipAssignment;
import java.util.Scanner;
class FindLeapYear{
    static void isLeap(int y){
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
public class LeapYears {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int y=sc.nextInt();
        FindLeapYear fly = new FindLeapYear();
        fly.isLeap(y);
    }
}
