package AnudipAssignment;
import java.util.Scanner;
class Finds{


   static  int reverse(int n){
       int rev=0;
       while(n!=0){
           rev= (rev*10)+n%10;
           n=n/10;
        }
       return rev;
    }

}
public class Reverse_No {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        Finds fs= new Finds();
        int ans=fs.reverse(n);
        System.out.println("The Reverse Number:"+ans);
    }
}
