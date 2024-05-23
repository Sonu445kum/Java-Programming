package Anudeep;
import java.util.Scanner;
import java.io.*;

public class Switch {
static void Check(int n){
    switch (n) {
        case 1: System.out.println(" Current Amount:");
            break;
        case 2: System.out.println(" Deposit Amount:");
            break;
        case 3: System.out.println(" Withdrow Amount:");
            break;
        default:
            System.out.println("Invalid  Code Number:");
            break;
    }
}
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        String code;
        System.out.print("Enter  Code Number: ");
        int n=in.nextInt();
        Switch obj=new Switch();
        obj.Check(n);




    }
}
