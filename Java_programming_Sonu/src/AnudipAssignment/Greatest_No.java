package AnudipAssignment;
import java.util.Scanner;
class Find{
    int Greater(int a,int b, int c){
        if((a>b)&& (a>c)){
            return a;
        }
        else if((b>a)&& (b>c)){
            return b;
        }
        else{
            return c;
        }
    }
}
public class Greatest_No {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b=sc.nextInt();
        System.out.println("Enter the Third  Number:");
        int c=sc.nextInt();
        Find f= new Find();
       int ans= f.Greater(a,b,c);
        System.out.println("The Greatest Number:"+ans);
    }
}
