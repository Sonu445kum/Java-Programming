package Encapsulation;
import java.util.Scanner;
class ElectricBill{
    public static int Bill(int units){
        if (units <= 100) {
            return units * 10;
        }
        else if (units <= 200) {
            return (100 * 10) + (units - 100) * 15;
        }
        else if (units <= 300) {
            return (100 * 10) + (100 * 15) + (units - 200) * 20;
        }
        else if (units > 300) {
            return (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
        }
        return 0;
    }
}

    public class CalculateBill {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int units=sc.nextInt();
        ElectricBill eb=new ElectricBill();
        System.out.println("The Electric Bill:"+eb.Bill(units));
    }
}
