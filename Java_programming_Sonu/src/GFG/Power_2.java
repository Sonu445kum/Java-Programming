package GFG;
import java.util.*;
class Find{
    public static boolean IsPower2(long n){
       while(n%2==0){
           n=n/2;
       }
       if(n==1) return true;
       return false;
    }
}
public class Power_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n=sc.nextInt();
        Find f= new Find();
       boolean ans= f.IsPower2(n);
        System.out.println("The number is Power Of Two :"+ans);
    }
}
