package oops;
import java.util.Scanner;
class algebra{
    int add(int a, int b){
        int ans=a+b;
        return ans;
    }
}
public class main2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the first Number is:");
        int a= sc.nextInt();
        System.out.println(" Enter the Second Number is:");
        int b= sc.nextInt();
        algebra obj=new algebra();
        int ans=obj.add(a,b);
        System.out.println(" The Sum of Two No is:"+ ans);
    }
}
