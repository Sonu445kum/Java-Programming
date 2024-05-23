package AnudipAssignment;

import java.util.Scanner;
class FindPow{
    static int  PowAB(int a,int b){
        // Base Case;
        if(b==0){
            return 1;
        }

        // Recursive Call;
        return  a*PowAB(a,b-1);
    }
}

public class Power {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        FindPow fp=new FindPow();
        System.out.println("Enter Your  first Number:");
        int a=sc.nextInt();
        System.out.println("Enter Your  first Number:");
        int b=sc.nextInt();
        System.out.println("The power of A and B:"+fp.PowAB(a,b));


    }
}
