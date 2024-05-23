package Loops;

import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        int original_n=n;
        int ans=0;
        while(n>0){
            ans=ans+ n%10;
            n=n/10;
        }
        System.out.println("the sum of digit is:"+ ans);
    }
}
