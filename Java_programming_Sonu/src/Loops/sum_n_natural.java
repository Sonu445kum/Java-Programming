package Loops;
import java.util.Scanner;
public class sum_n_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n=sc.nextInt();
        int num=1;
        int sum=0;
        while(num<=n){
            sum=sum+num;
            num++;
        }
        System.out.println(" the sum of n natural Number is: "+ sum);
    }
}
